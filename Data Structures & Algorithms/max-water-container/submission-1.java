class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0;
        int p2 = heights.length - 1;
        int maxVol = 0;
        while(p1 < p2){
            int vol = Math.min(heights[p1], heights[p2])*(p2-p1);
            maxVol = Math.max(maxVol, vol);
            if(heights[p1] > heights[p2]){
                p2--;
            } else{
                p1++;
            }
        }
        return maxVol;
    }
}
