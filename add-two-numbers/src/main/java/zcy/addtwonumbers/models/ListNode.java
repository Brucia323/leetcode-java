package zcy.addtwonumbers.models;

import java.beans.JavaBean;

/**
 * Definition for singly-linked list.
 */
@JavaBean
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
