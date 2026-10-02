class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i = 0; i <= n; i++){
            int c = 0;
            for(int j = 0; j < 32; j++){
                if(( 1 << j & i) != 0){
                    c++;
                }
            }
            res[i] = c;
        }
        return res;
    }
}
