package zcy.medianoftwosortedarrays.services.impl;

import zcy.medianoftwosortedarrays.services.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionImpl implements Solution {
    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>(Arrays.stream(nums1).boxed().toList());
        list.addAll(Arrays.stream(nums2).boxed().toList());
        list.sort(Integer::compareTo);
        if (list.size() % 2 == 0) {
            return (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2.0;
        }
        return list.get(list.size() / 2);
    }
}
