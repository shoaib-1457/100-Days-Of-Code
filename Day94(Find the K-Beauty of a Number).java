class Solution {
    public int divisorSubstrings(int num, int k) {
    String str=String.valueOf(num);
        int a=0;
        for(int i=0;i<=str.length()-k;i++){
            int ans=Integer.parseInt(str.substring(i,i+k));
            if(ans !=0 && num % ans==0){
              a++;
            }
        }
        return a;
    }
}
