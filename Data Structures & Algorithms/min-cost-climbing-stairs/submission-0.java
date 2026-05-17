class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int min = 0;
        int[][] dp = new int[cost.length+1][cost.length+1];
        for(int i = 0; i < dp.length-1; i ++){
            for(int j = 0; j < dp.length; j++){
                if(i >= j){
                    continue;
                }
                if(j - 2 < 0 && j - 1 >= 0){
                    dp[i][j] = dp[i][j-1]+ cost[j-1];
                }else {
                    dp[i][j] = Math.min(dp[i][j-1]+ cost[j-1], dp[i][j-2]+ cost[j-2]);
                }
            }
        }
        return Math.min(dp[0][cost.length], dp[1][cost.length]);
    }
}
