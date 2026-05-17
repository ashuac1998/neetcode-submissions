
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. Sort the array - this is essential for the two-pointer approach.
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // 2. Loop through the array, fixing one element `nums[i]`.
        // Loop only up to nums.length - 2 because we need at least two more elements.
        for (int i = 0; i < nums.length - 2; i++) {
            // FIX #3: Skip duplicate fixed elements to avoid duplicate triplets.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // FIX #2: Set pointers relative to `i`.
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                // FIX #1: Calculate sum with current pointer values inside the loop.
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    // Found a triplet!
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // FIX #3: Skip duplicates for the left and right pointers.
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move pointers to find the next unique pair.
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
}