class Solution {
    public int maximumXOR(int[] nums) {
    int ans = 0;
        for (int a: nums){
            ans |= a;
        }
        return ans;
    }
}
