​Time Complexity: O(n)

Space Complexity: O(n)

Note: using Hash Table reduce time complexity from two nested loops of O(n2) to O(n)

One-pass Hash Table Solution:
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
```
Looking for the complementary pair while inserting elements into the hash table. Return the pair immediately when found the pair.
