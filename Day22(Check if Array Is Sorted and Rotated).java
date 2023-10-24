class Solution {
    public boolean check(int[] nums) {
        int ans =0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                ans++;
            }
        }
        if(ans == 0){
            return true;
        }
        else if(ans >1){
            return false;
        }
        else if(nums[0] >= nums[nums.length-1]){
            return true;
        }
        return false;
    }
}
