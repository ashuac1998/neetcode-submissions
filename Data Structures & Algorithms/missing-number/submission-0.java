class Solution {
    public int missingNumber(int[] nums) {
        int[] freq = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]] = 1;
        }
        int i = 0;
        while(freq[i] != 0){
            i++;
        }
        return i;
    }
}
