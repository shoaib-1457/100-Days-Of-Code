class Solution {
    public int consecutiveNumbersSum(int n) {
        int a =1;
        int ans =0;
        while(n>0){
            n = n-a;
            if(n%a == 0){
                ans++;
            }
            a++;
        }
        return ans;
    }
}
