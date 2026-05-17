class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int currSum = 0;
        int expectedSum = 0;
        for(int i : nums){
            currSum += i;
            set.add(i);
        }
        for(Integer i : set){
            expectedSum += i;
        }
        expectedSum *= 2;
        return expectedSum - currSum;
    }
}
