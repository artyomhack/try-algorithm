package dataStructure.test.linkedList;

import dataStructure.list.linkedlist.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLinkedList {


    @Test
    public void check_insert() {
        LinkedList list = new LinkedList();
        list.addFirst(12);
        list.insert(0, 10);
        list.insert(1, 14);
        list.addLast(16);
        list.insert(3, 20);
        System.out.println(list);

        java.util.LinkedList<Integer> list2 = new java.util.LinkedList<>();

        list2.addFirst(12);
        list2.add(0, 10);
        list2.add(1, 14);
        list2.addLast(16);
        list2.add(3, 20);
        System.out.println(list2);
    }

    @Test
    public void check_addFirstAndLast() {
        LinkedList list = new LinkedList();
        list.addFirst(12);
        list.addFirst(10);
        list.addLast(14);
        list.addLast(16);
        System.out.println(list);
        Assertions.assertEquals(4, list.size())
        ;
    }

    @Test
    public void check_getFirstAndLastAndIndex() {
        LinkedList list = new LinkedList();
        list.insert(0, 12);
        list.insert(1, 24);
        list.insert(2, 48);
        System.out.println(list);

        Assertions.assertEquals(12, list.getFirst());
        Assertions.assertEquals(24, list.get(1));
        Assertions.assertEquals(48, list.getLast());
    }

    @Test
    public void check_removeFirstAndLastAndIndex() {
        LinkedList list = new LinkedList();
        list.insert(0, 12);
        list.insert(1, 24);
        list.insert(2, 48);
        list.insert(3, 72);

        list.remove(1);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        Assertions.assertEquals(1, list.size());
    }

}
