class Solution {
    public int integerReplacement(int n) {
        return replace((long)n);
    }
    
    int replace(long n){
       int ans=0;
        if(n<=1){
            return 0;
        }
        
        if(n%2==0){
            ans=1+replace(n/2);
        }
        else{
            ans=1+Math.min(replace(n+1),replace(n-1));
            }
        return ans;     
    }
}
