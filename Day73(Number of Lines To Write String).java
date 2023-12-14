class Solution {
    public int[] numberOfLines(int[] widths, String s) {
    int sum=0,ans=0;
            for(int j=0;j<s.length();j++)
            {
                int pos = s.charAt(j)-'a';
                sum+=widths[pos];
                if(sum>100)
                {
                    j--;
                    ans++;
                    sum=0;
                    continue;
                }
            }
        int[] arr = new int[2];
        arr[0]=ans+1;
        arr[1]=sum;
        return arr; 
    }
}
