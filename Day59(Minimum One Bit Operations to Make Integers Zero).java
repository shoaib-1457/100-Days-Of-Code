class Solution {
    public int minimumOneBitOperations(int n) {
        int multiplier = 1;
        int ans = 0;
        while (n > 0) {
            ans += n ^ (n - 1) * multiplier;
            multiplier = -1 * multiplier;
            n &= n - 1;
        }
        return Math.abs(ans);
    }
}
