package zcy.twosum.services.impl;

import zcy.twosum.services.Solution;

import java.util.HashMap;
import java.util.Map;

public class SolutionImpl implements Solution {
    @Override
    public int[] twoSum(int[] nums, int target) {
        final int N = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
