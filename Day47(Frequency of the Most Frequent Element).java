class Solution {
    public int maxFrequency(int[] nums, int k) {
        int ans = 0; 
        long curr = 0; 
        Arrays.sort(nums); 
        for (int left = 0, right = 0; right < nums.length; ++right) {
            curr += nums[right]; 
            while (curr + k < (long) nums[right] * (right - left + 1)) {
                curr -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
