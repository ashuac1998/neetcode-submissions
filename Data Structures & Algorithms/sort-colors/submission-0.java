class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 0);
        map.put(2, 0);
        for(int i : nums){
            map.put(i, map.get(i) + 1);
        }
        int j = 0;
        for(int i = 0; i < 3; i++){
            int count = map.get(i);
            while(count > 0){
                nums[j] = i;
                j++;
                count--;
            }
        }
    }
}