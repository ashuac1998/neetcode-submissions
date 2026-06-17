class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    int top = i - 1 < 0 ? 1 : (grid[i-1][j] == 0 ? 1 : 0);
                    int down = i + 1 >= grid.length ? 1 : (grid[i+1][j] == 0 ? 1 : 0);
                    int left = j - 1 < 0 ? 1 : (grid[i][j-1] == 0 ? 1 : 0);
                    int right = j + 1 >= grid[0].length ? 1 : (grid[i][j+1] == 0 ? 1: 0);
                    perimeter += top + down + left + right;
                }
            }
        }
        return perimeter;
    }
}