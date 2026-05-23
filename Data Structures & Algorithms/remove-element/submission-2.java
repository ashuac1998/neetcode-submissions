class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length-1;
        while(l < r){
            while(r > 0 && nums[r] == val){
                r--;
            }
            if(nums[l] == val){
                nums[l] = nums[r];
                nums[r] = val;
            }
            l++;
        }
        int result = 0;
        for(int i : nums){
            if(i == val){
                break;
            }
            result++;
        }
        return result;
    }
}