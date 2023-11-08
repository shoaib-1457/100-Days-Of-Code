class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int ans=0;
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int y=0; y<n; y++){
                arr[i][y]=grid[y][i];
            }
        }
        for(int[] row:grid){
            for(int[] column:arr){
                if(Arrays.equals(row, column)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
