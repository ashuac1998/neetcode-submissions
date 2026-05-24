class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = Math.min(word1.length(), word2.length());
        String res = "";
        while(i < j){
            res += word1.charAt(i);
            res += word2.charAt(i);
            i++;
        }
        res += word1.length() > word2.length() ? word1.substring(i) : word2.substring(i);
        return res;
    }
}