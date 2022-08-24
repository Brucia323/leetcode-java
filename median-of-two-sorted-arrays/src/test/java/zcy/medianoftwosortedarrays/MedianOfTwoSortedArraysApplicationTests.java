package zcy.medianoftwosortedarrays;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import zcy.medianoftwosortedarrays.services.Solution;
import zcy.medianoftwosortedarrays.services.impl.SolutionImpl;

@Slf4j
@SpringBootTest
class MedianOfTwoSortedArraysApplicationTests {

    @Test
    void contextLoads() {
        int[][] nums1 = new int[][]{{1, 3}, {1, 2}};
        int[][] nums2 = new int[][]{{2}, {3, 4}};
        Solution solution = new SolutionImpl();
        for (int i = 0; i < nums1.length; i++) {
            log.info("nums1: {}, nums2: {}, return: {}", nums1[i], nums2[i], solution.findMedianSortedArrays(nums1[i], nums2[i]));
        }
    }

}
