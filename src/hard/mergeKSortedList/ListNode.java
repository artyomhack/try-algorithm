package hard.mergeKSortedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode sortedHeadNode = new ListNode(0, null);
        ListNode sortedPointer = sortedHeadNode;
        int k = 1;
        while (k <= lists.length - 1) {
            ListNode list1 = lists[k-1];
            ListNode list2 = lists[k++];
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    sortedPointer.next = list1;
                    list1 = list1.next;
                } else {
                    sortedPointer.next = list2;
                    list2 = list2.next;
                }
                sortedPointer = sortedPointer.next; //переходит на новый узел
            }

            if (list1 == null)
                sortedPointer.next = list2;
            else
                sortedPointer.next = list1;
        }

        return sortedHeadNode.next;
    }
}

