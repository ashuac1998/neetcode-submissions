class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for(int i = n/2 - 1; i >= 0; i--){
            heapify(nums, n, i);
        }
         for (int i = n - 1; i >= 0; i--) {
            // Move current root to the end (swap arr[0] and arr[i])
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // Call max heapify on the reduced heap
            heapify(nums, i, 0);
        }
        return nums;
    }
    public void heapify(int[] nums, int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && nums[largest] < nums[left]){
            largest = left;
        }  
        if (right < n && nums[largest] < nums[right]){
            largest = right;
        }
        if(largest != i){
            int swap = nums[i];
            nums[i] = nums[largest];
            nums[largest] = swap;
            heapify(nums, n, largest);
        }

        
    }
}