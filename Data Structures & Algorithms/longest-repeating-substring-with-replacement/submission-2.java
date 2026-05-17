class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26]; // Tracks character frequencies in the current window
        int left = 0;
        int maxFreq = 0; // Tracks the highest frequency of any single character in the current window
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Include the current character in the window
            char rightChar = s.charAt(right);
            counts[rightChar - 'A']++;
            
            // Update the maximum frequency seen in the current window
            maxFreq = Math.max(maxFreq, counts[rightChar - 'A']);

            // Current window size is (right - left + 1)
            // Number of replacements needed = window size - maxFreq
            if ((right - left + 1) - maxFreq > k) {
                // The window is invalid, shrink it from the left
                char leftChar = s.charAt(left);
                counts[leftChar - 'A']--;
                left++;
            }

            // The window is guaranteed to be valid at this point
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}