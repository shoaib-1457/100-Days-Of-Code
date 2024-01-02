class Solution {
    public int arrayNesting(int[] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                int c=0,k=nums[i];
                while(nums[k]!=-1){
                    int j=k;
                    k=nums[k];
                    nums[j]=-1;
                    c++;
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}
