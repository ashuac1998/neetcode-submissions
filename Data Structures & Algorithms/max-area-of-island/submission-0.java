
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int[] maxArea = new int[1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) { 
                if (grid[i][j] == 1) {
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i, j});
                    grid[i][j] = 2; 
                    checkAdjacent(grid, queue, maxArea);
                    
                }
            }
        }        
        return maxArea[0];
    }

    void checkAdjacent(int[][] grid, Queue<int[]> queue, int[] maxArea) {
        int area = 1;
        while (!queue.isEmpty()) {
            int[] head = queue.poll();
            int i = head[0];
            int j = head[1];
            
            // check left
            if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                grid[i][j - 1] = 2; // Mark visited immediately
                queue.add(new int[]{i, j - 1});
                area++;
            }
            // check top
            if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                grid[i - 1][j] = 2; // Mark visited immediately
                queue.add(new int[]{i - 1, j});
                area++;
            }
            // check right
            if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                grid[i][j + 1] = 2; // Mark visited immediately
                queue.add(new int[]{i, j + 1});
                area++;
            }
            // check bottom
            if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                grid[i + 1][j] = 2; // Mark visited immediately
                queue.add(new int[]{i + 1, j});
                area++;
            }
        }
        maxArea[0] = Math.max(area, maxArea[0]);
    }
}
