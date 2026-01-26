package TwoPointers;

import java.util.HashMap;
import java.util.Map;

/**
 * 167. Two Sum II - Input Array Is Sorted
 * Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
 * Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 */
public class TwoSumII {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
