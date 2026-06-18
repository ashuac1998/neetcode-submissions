

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // Step 1: Create a fast lookup array for character ranks
        int[] charOrder = new int[26];
        for (int i = 0; i < order.length(); i++) {
            charOrder[order.charAt(i) - 'a'] = i;
        }
        
        // Step 2: Compare adjacent words
        for (int i = 0; i < words.length - 1; i++) {
            if (!isSorted(words[i], words[i + 1], charOrder)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isSorted(String word1, String word2, int[] charOrder) {
        int len1 = word1.length();
        int len2 = word2.length();
        int minLen = Math.min(len1, len2);
        
        for (int k = 0; k < minLen; k++) {
            char c1 = word1.charAt(k);
            char c2 = word2.charAt(k);
            
            if (c1 != c2) {
                // If they differ, the first different char must follow the alien order
                return charOrder[c1 - 'a'] < charOrder[c2 - 'a'];
            }
        }
        
        // If we reached here, all compared characters match.
        // Example: "neetcode" vs "neet". Word 1 cannot be longer than Word 2.
        return len1 <= len2;
    }
}