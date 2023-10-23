class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                ans++;
            }
            else{
                max=Math.max(ans,max);
                ans=0;
            }
        }
        ans= Math.max(ans,max);
        return ans;
    }
}
