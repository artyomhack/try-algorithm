package hard.mergeKSortedList;

import java.util.PriorityQueue;
import java.util.Queue;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}

class Solution {
    public static ListNode mergeKLists(ListNode[] lists) {
        Queue<Integer> values = new PriorityQueue<>();
        ListNode pointer;

        for (int i = 0; i < lists.length; i++) {
            pointer = lists[i];
            while (pointer != null) {
                values.add(pointer.val);
                pointer = pointer.next;
            }
        }

        if (values.isEmpty())
            return null;

        pointer = new ListNode(values.poll(), null);
        ListNode head = pointer;
        while (!values.isEmpty()) {
            pointer.next = new ListNode(values.poll(), null);
            pointer = pointer.next;
        }

        return head;
    }
}

