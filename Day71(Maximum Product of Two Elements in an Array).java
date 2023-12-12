class Solution {
    public int maxProduct(int[] nums) {
         int ans =0;
        Arrays.sort(nums);
        for(int i =0; i<nums.length; i++){
            ans = (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
        }
        return ans;
    }
}
