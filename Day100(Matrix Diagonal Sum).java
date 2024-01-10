class Solution {
    public int diagonalSum(int[][] mat) {
    int n = mat.length;
        if(n == 1){
            return mat[0][0];
        } 
        int ans =0, j = 0;
        for(int i = 0;i<n;i++){
            if((n & 1) == 1){
             if(j == n/2){
                ans+=mat[i][j];
             }
             else{
                ans+=mat[i][j] + mat[i][n-j-1];
             }
            }
            else{
           ans+=mat[i][j] + mat[i][n-j-1];
            } 
           j++;  
        }
        return ans;
    }
}
