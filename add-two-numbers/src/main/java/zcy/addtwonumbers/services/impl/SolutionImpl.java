package zcy.addtwonumbers.services.impl;

import zcy.addtwonumbers.models.ListNode;
import zcy.addtwonumbers.services.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionImpl implements Solution {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        l.val = l1.val + l2.val;
        if (l1.next != null && l2.next != null) {
            if (l.val >= 10) {
                l1.next.val += 1;
            }
            l.next = addTwoNumbers(l1.next, l2.next);
        } else if (l1.next != null) {
            l2.val = 0;
            if (l.val >= 10) {
                l1.next.val += 1;
            }
            l.next = addTwoNumbers(l1.next, l2);
        } else if (l2.next != null) {
            l1.val = 0;
            if (l.val >= 10) {
                l2.next.val += 1;
            }
            l.next = addTwoNumbers(l1, l2.next);
        } else {
            if (l.val >= 10) {
                l.next = new ListNode();
                l.next.val = 1;
            }
        }
        l.val = l.val % 10;
        return l;
    }

    @Override
    public List<Integer> toList(ListNode listNode) {
        List<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            if (listNode.next == null) {
                break;
            }
            listNode = listNode.next;
        }
        return list;
    }

    @Override
    public ListNode toListNode(int[] ints) {
        ListNode listNode = new ListNode();
        ListNode listNode1 = listNode;
        for (int i = 0; i < ints.length; i++) {
            listNode1.val = ints[i];
            if (i + 1 == ints.length) {
                break;
            }
            listNode1 = listNode1.next = new ListNode();
        }
        return listNode;
    }
}
