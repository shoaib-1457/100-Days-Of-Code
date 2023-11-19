class Solution {
    public int distributeCandies(int[] ct) {
        Arrays.sort(ct);
        int len = ct.length;
        int ans = 0;
        int temp = len / 2;
        for (int i = 0; i < len && temp > 0; i++) {
            while (i < len - 1 && ct[i] == ct[i+1]){
                i++;
            }
            ans++;
            temp--;
        }

        return ans;
    }
}
