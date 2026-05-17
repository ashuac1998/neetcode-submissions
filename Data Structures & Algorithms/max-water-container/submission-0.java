class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxVol = 0;
        for(int i = 0; i < n; i++){
            int length1 = heights[i];
            for(int j = 0; j < n; j++){
                int length2 = heights[j];
                int vol = Math.abs(Math.min(length2,length1)*(j-i));
                maxVol = Math.max(maxVol, vol);
            }
        }
        return maxVol;
    }
}
