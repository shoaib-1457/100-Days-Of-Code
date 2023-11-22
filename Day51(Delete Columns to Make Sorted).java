class Solution {
    public int minDeletionSize(String[] strs) {
        int row=strs.length;
        int col=strs[0].length();
        int ans=0;

        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row-1;j++)
            {
                if(strs[j].charAt(i)>strs[j+1].charAt(i))
                {
                    ans++;
                    break;
                }
            }
        }
        return ans;   
    }
}
