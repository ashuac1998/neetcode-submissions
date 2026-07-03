class Solution {
    public int findJudge(int n, int[][] trust) {
        // Array to store net trust scores for each person (1 to n)
        int[] trustScores = new int[n + 1];
        
        // Calculate trust scores
        for (int[] relationship : trust) {
            int citizen = relationship[0];
            int trusted = relationship[1];
            
            trustScores[citizen]--; // Citizen trusts someone, decrease score
            trustScores[trusted]++; // Trusted person gains trust, increase score
        }
        
        // Find the person with a net trust score of n - 1
        for (int i = 1; i <= n; i++) {
            if (trustScores[i] == n - 1) {
                return i;
            }
        }
        
        return -1;
    }
}
