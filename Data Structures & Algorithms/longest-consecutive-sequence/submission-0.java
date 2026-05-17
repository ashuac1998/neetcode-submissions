class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> set = new HashSet<>();
      for(int i : nums){
        set.add(i);
      }
      int maxLen = 0;
      for(int i : nums){
        int currLen = 1;
        int nextNum = i+1;
        while(set.contains(nextNum)){
            nextNum++;
            currLen++;
        }
        maxLen = Math.max(maxLen, currLen);
      }  
      return maxLen;
    }
}
