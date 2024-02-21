package easy.linkedList.mergeTwoSortedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sortedHeadNode = new ListNode(0, null);
        ListNode sortedPointer = sortedHeadNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                sortedPointer.next = list1;
                list1 = list1.next;
            } else {
                sortedPointer.next = list2;
                list2 = list2.next;
            }
            sortedPointer = sortedPointer.next;
        }

        if (list1 == null)
            sortedPointer.next = list2;
        if (list2 == null)
            sortedPointer.next = list1;

        return sortedHeadNode.next;
    }
}