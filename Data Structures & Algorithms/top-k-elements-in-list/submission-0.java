class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return map.entrySet().stream()
            // Sort by frequency values in descending order
            .sorted((a, b) -> b.getValue() - a.getValue())
            // Extract the original number (the key)
            .mapToInt(Map.Entry::getKey)
            // Take only the top K elements (replaces subList)
            .limit(k)
            // Convert safely directly to primitive int[]
            .toArray();
    }
}
