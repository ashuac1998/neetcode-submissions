class Solution {
    public int findJudge(int n, int[][] trust) {
        // Track incoming and outgoing edges for each node (1-indexed)
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];
        
        // Build the graph degrees
        for (int[] edge : trust) {
            int u = edge[0]; // Source node
            int v = edge[1]; // Destination node
            
            outDegree[u]++;
            inDegree[v]++;
        }
        
        // Find the node that satisfies judge conditions
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == n - 1 && outDegree[i] == 0) {
                return i;
            }
        }
        
        return -1;
    }
}
