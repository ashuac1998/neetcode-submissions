class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(target, nums, 0, nums.length - 1);
    }
    public int binarySearch(int target, int[] nums, int left, int right){
        int mid = left + (right - left)/2;
        if(nums[left] > target){
            return left;
        } else if (nums[right] < target){
            return right + 1;
        }else if(nums[mid] == target){
            return mid;
        }else if (left >= right){
            return mid + 1;
        }else if(nums[mid] > target){
            return binarySearch(target, nums, left, mid - 1);
        } else {
            return binarySearch(target, nums, mid + 1, right);
        }
    }
}