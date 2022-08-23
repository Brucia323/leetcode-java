package zcy.addtwonumbers.services;

import zcy.addtwonumbers.models.ListNode;

import java.util.List;

public interface Solution {
    /**
     * 两数相加
     *
     * @param l1 非空链表
     * @param l2 非空链表
     * @return 表示和的链表
     */
    ListNode addTwoNumbers(ListNode l1, ListNode l2);

    List<Integer> toList(ListNode listNode);

    ListNode toListNode(int[] ints);
}
