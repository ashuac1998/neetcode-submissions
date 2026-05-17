class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int slow = 0;
        int fast = slow;
        int[] result = new int[temperatures.length];
        while(slow < temperatures.length-1){
            while(fast < temperatures.length && temperatures[fast] <= temperatures[slow]){
                fast++;
            }

            if(fast < temperatures.length && temperatures[fast] > temperatures[slow]){
                result[slow] = fast-slow;
            }
            
            slow++;
            fast=slow;
        }
        return result;
    }
}
