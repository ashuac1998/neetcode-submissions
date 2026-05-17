class Solution {
    public int missingNumber(int[] nums) {
        int currSum = 0;
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
        }
        int actualSum = 0;
        for(int j = 0; j <= nums.length; j++){
            actualSum += j;
        }
        return actualSum - currSum;
    }
}
