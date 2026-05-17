class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = matrix[0][0];
        int high = matrix[matrix.length - 1][matrix[0].length - 1];
        if(target < low || target > high){
            return false;
        }
        int[] array = arraySearch(matrix, target);
        return binarySearch(array, 0, array.length -1, target);
        
    }
    public int[] arraySearch(int[][] matrix, int target){
        for(int i = 0; i < matrix.length; i++){
            int low = matrix[i][0];
            int high = matrix[i][matrix[i].length - 1];
            if(target <= high && target >= low){
                return matrix[i];
            }
        }
        return new int[0];
    }

    public boolean binarySearch(int[] arr, int low, int high, int target){
        
        if(arr.length == 0 || low > high){
            return false;
        }

        int mid = low + (high - low)/2;
        
        if(target == arr[mid]){
            return true;
        }
        
        if(target > arr[mid]){
            return binarySearch(arr, mid + 1, high, target);
        } 
        
        return binarySearch(arr, low, mid - 1, target);
        
    }
}
