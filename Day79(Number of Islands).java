class Solution {
    public int numIslands(char[][] grid) {
    int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    Land(grid, i, j);
                }
            }
        }
        return count; 
    }
        public void Land(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }    
        grid[i][j] = '0';
        Land(grid, i+1, j);
        Land(grid, i-1, j);
        Land(grid, i, j+1);
        Land(grid, i, j-1);
        return;
    }
}
