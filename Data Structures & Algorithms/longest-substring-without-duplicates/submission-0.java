class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            max = Math.max(max, set.size());
        }
     return max;
    }
}
