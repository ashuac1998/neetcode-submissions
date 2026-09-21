

class Solution {
    public void islandsAndTreasure(int[][] grid) {
        if (grid == null || grid.length == 0) return;
        
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        
        // 1. Add all treasures (0s) to the queue as our starting points
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        // 2. Perform Multi-Source BFS
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            
            // Check all 4 adjacent cells
            for (int[] dir : directions) {
                int r = row + dir[0];
                int c = col + dir[1];
                
                // If out of bounds, is a wall (-1), or is already visited/closer to another treasure
                if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] != 2147483647) {
                    continue;
                }
                
                // Update the distance and add to the queue to process its neighbors
                grid[r][c] = grid[row][col] + 1;
                queue.offer(new int[]{r, c});
            }
        }
    }
}