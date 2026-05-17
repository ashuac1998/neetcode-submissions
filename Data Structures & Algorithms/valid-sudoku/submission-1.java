class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[10];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if (board[i][j] == '.') continue;
                int val = Character.getNumericValue(board[i][j]);
                if(rows[val] >= 1){
                    return false;
                }
                rows[val]++;
            }
            rows = new int[10];
        }
    
        int[] cols = new int[10];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if (board[j][i] == '.') continue;
                int val = Character.getNumericValue(board[j][i]);
                if(cols[val] >= 1){
                    return false;
                }
                cols[val]++;
            }
            cols = new int[10];

        }

        for (int block = 0; block < 9; block++) {
            int[] sub = new int[10];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char curr = board[i + 3 * (block / 3)][j + 3 * (block % 3)];
                    if (curr == '.') continue;
                    int val = Character.getNumericValue(curr);
                    if (sub[val] >= 1) return false;
                    sub[val]++;
                }
            }
        }
        return true;
    }
}
