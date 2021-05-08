package org.blt.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int minusNum = target - nums[i];
            if (map.containsKey(minusNum)) {
                if (map.get(minusNum) != i)
                    return new int[]{map.get(minusNum), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
