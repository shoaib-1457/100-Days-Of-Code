class Solution {
    public int smallestRepunitDivByK(int k) {
    int ans=1;
        for(int i=0;ans<=k;ans++){
            if((i=(i*10+1)%k)==0){
                return ans;
            }
        }
        return -1;
    }
}
