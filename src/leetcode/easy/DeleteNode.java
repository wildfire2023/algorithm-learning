package leetcode.easy;

import java.awt.image.ShortLookupTable;

public class DeleteNode {
    /**
     * 类变量、静态代码块、实例变量、实例代码块、构造器、方法或嵌套类
     */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        // 快指针走n步
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) { // 如果fast指向null，表示删除的是头结点
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
