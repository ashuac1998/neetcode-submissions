class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }
    public int binarySearch(int[] nums, int target, int l, int r){
        int mid = l+(r-l)/2;
        if(nums[mid] == target){
            return mid;
        } else if(l >= r){
            return -1;
        }

        int val = nums[mid];

        if(val > target){
            return binarySearch(nums, target, l, mid-1);
        } else {
            return binarySearch(nums, target, mid+1, r);
        }
    }
}
