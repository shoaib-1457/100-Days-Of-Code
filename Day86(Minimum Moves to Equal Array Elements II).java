class Solution {
    public int minMoves2(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int n = nums.length;
        Arrays.sort (nums);
        int mid = n/2;
        int ans = 0;
        for (int i = 0; i < n; i++)
            ans += (Math.abs (nums [i] - nums [mid]));
        return ans;
    }
}
