class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0; i<sentences.length; i++) {
            ans = Math.max(ans,(sentences[i].split(" ")).length);
        }
        return ans;
    }
}
