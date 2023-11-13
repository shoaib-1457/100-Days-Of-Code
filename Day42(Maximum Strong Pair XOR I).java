class Solution {
    public int maximumStrongPairXor(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0;i < nums.length; ++i) {
            for(int j = i + 1; j < nums.length; ++j) {
                if (nums[j] - nums[i] <= nums[i]) {
                    ans = Math.max(ans, nums[i] ^ nums[j]);
                } else {
                    break;
                }
            }
        }
        return ans; 
    }
}
