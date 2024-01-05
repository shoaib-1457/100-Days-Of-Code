class Solution {
    public int findPairs(int[] nums, int k){
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            if (i == 0 || nums[i] != nums[i - 1]){
                if (bs(nums, i + 1, nums[i] - k)) count++;
                if (k != 0 && bs(nums, i, nums[i] + k)) count++;
            }
        }
        return count;
    }

    private boolean bs(int[] nums, int start, int target) {
        int left = start, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return true;
            if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}
