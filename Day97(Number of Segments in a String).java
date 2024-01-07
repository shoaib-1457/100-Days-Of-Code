class Solution {
    public int countSegments(String s) {
        String[] words = s.split(" ");
        int ans = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                ans++;
            }
        }
        return ans;
    }
}
