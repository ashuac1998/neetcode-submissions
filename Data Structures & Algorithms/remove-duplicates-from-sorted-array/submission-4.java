class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            } else {
                nums[i] = Integer.MAX_VALUE;
            }
        }
        // if(set.size() == nums.length){
        //     return 0;
        // }
        Arrays.sort(nums);
        // for(int i = n / 2 - 1; i >= 0; i--){
        //     heapify(nums, n, i);
        // }
        // for(int i = n - 1; i >= 0; i--){
        //     int temp = nums[i];
        //     nums[i] = nums[0];
        //     nums[0] = temp;
        //     heapify(nums, i, 0);
        // }
        int k = 0;
        while(k < n && nums[k] != Integer.MAX_VALUE){
            k++;
        }
        return k;
    }
    public void heapify(int[] nums, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && nums[largest] < nums[left]){
            largest = left;
        }
        if(right < n && nums[largest] < nums[right]){
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