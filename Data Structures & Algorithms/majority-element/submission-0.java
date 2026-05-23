class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap<>();
        int maxCount = Integer.MIN_VALUE;
        int majorityNum = 0;
        for(int i : nums){
            int count = countMap.getOrDefault(i, 0);
            countMap.put(i, count + 1);
            if(maxCount < count){
                maxCount = count;
                majorityNum = i;
            }
        }
        return majorityNum;
    }
}