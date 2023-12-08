class Solution {
    public int findNthDigit(int n) {
       int length = 1;
       int start = 1;
       long ans = 9;
       while(n > length*ans) {
           n -= length*ans;
           length++;
           ans*=10;
           start*=10;
       } 
       start += (n-1)/length;
       String string = Integer.toString(start);
       return Character.getNumericValue(string.charAt((n-1)%length));
    }
}
