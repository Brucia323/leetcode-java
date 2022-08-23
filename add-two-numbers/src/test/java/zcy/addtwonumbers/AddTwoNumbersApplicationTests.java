package zcy.addtwonumbers;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import zcy.addtwonumbers.models.ListNode;
import zcy.addtwonumbers.services.Solution;
import zcy.addtwonumbers.services.impl.SolutionImpl;

@Slf4j
@SpringBootTest
class AddTwoNumbersApplicationTests {

    @Test
    void contextLoads() {
        int[][] l1 = new int[][]{{2, 4, 3}, {0}, {9, 9, 9, 9, 9, 9, 9}};
        int[][] l2 = new int[][]{{5, 6, 4}, {0}, {9, 9, 9, 9}};
        Solution solution = new SolutionImpl();
        for (int i = 0; i < l1.length; i++) {
            ListNode listNode = solution.toListNode(l1[i]);
            ListNode listNode1 = solution.toListNode(l2[i]);
            ListNode listNode2 = solution.addTwoNumbers(listNode, listNode1);
            log.info("l1: {}, l2: {}, return: {}", l1[i], l2[i], solution.toList(listNode2));
        }
    }

}
