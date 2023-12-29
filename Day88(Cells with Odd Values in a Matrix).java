class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int temp[][] = new int[m][n];
        for(int  i = 0; i<indices.length ; i++){
            int r = indices[i][0];
            int c = indices[i][1];
            for(int j = 0 ; j<n ; j++ ){
                temp[r][j] += 1;
            }
            for(int k = 0 ; k<m ; k++){
                temp[k][c] += 1; 
            }
            }
            int ans  = 0;
            for(int i = 0 ; i <m ; i++){
                for(int j = 0 ; j<n ; j++){
                    if(temp[i][j] % 2 != 0){
                        ans++;
                    }
                } 
            }
            return ans;
    }
}
