class Solution {
    public int maxProductDifference(int[] nums) {
    Arrays.sort(nums);
        int max1 = nums[nums.length - 1];
        int max2 = nums[nums.length - 2];
        int min1 = nums[0];
        int min2 = nums[1];
        
        int ans = (max1 * max2) - (min1 * min2);
        return ans;
    }
}
