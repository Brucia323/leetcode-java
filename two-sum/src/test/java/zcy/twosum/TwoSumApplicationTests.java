package zcy.twosum;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import zcy.twosum.services.Solution;
import zcy.twosum.services.impl.SolutionImpl;

@Slf4j
@SpringBootTest
class TwoSumApplicationTests {

    @Test
    void contextLoads() {
        int[][] nums = new int[][]{{2, 7, 11, 15}, {3, 2, 4}, {3, 3}};
        int[] target = new int[]{9, 6, 6};
        Solution solution = new SolutionImpl();
        for (int i = 0; i < nums.length; i++) {
            log.info("nums: {}, target: {}, return: {}", nums[i], target[i], solution.twoSum(nums[i], target[i]));
        }
    }

}
