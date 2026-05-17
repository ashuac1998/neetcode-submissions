class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // Populate the target frequency map for s1
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        int end = 0;

        while (end < s2.length()) {
            char charAtEnd = s2.charAt(end);
            // Expand the window by adding the rightmost character
            map2.put(charAtEnd, map2.getOrDefault(charAtEnd, 0) + 1);

            // Once the window reaches the exact size of s1, validate and slide
            if (end - start + 1 == s1.length()) {
                if (compareMaps(map1, map2)) {
                    return true;
                }

                // Shrink the window from the left before moving forward
                char charAtStart = s2.charAt(start);
                if (map2.get(charAtStart) == 1) {
                    map2.remove(charAtStart);
                } else {
                    map2.put(charAtStart, map2.get(charAtStart) - 1);
                }
                start++;
            }
            end++;
        }

        return false;
    }

    public boolean compareMaps(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        if (map1.size() != map2.size()) {
            return false;
        }
        
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char key = entry.getKey();
            // Integer comparison using !equals to safely avoid object-wrapper traps
            if (!entry.getValue().equals(map2.get(key))) {
                return false;
            }
        }
        return true;
    }
}