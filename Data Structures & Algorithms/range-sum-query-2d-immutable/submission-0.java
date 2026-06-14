class NumMatrix {
    int[][] matrix;
    int[][] prefixSum;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.prefixSum = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            this.prefixSum[i][0] = this.matrix[i][0];
            for(int j = 1; j <matrix[0].length; j++){
                this.prefixSum[i][j] = this.prefixSum[i][j-1] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i = row1; i <= row2; i++){
            if(col1 > 0){
                sum += this.prefixSum[i][col2] - this.prefixSum[i][col1-1];
            } else {
                sum += this.prefixSum[i][col2];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */