class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int a=0;
        int ans=Integer.MAX_VALUE;
        for(int i=divisors.length-1;i>=0;i--){
            int d=divisors[i];
             int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%d==0)
                c++;
            }
            if(c==a){
                ans=Math.min(ans,d);

            }
            if(c>a){
                a=c;
                ans=d;

            }
        }
        return ans;
    }
}
