package one_TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class Solution {
    private static Solution solution = new Solution();

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer value = target - nums[i];
            if (map.containsKey(value)) {
                return new int[]{map.get(value), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 1};
        int target = 13;
        int[] result = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}