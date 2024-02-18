package dataStructure.test.singleLinkedList;

import dataStructure.list.singleLinkedList.SingleLinkedList;
import dataStructure.list.singleLinkedList.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestSingleLinkedList {

    @Test
    public void check_printNodes() {
        Node node1 = new Node(10, null);
        Node node2 = new Node(17, null);
        Node node3 = new Node(21, null);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(null);

        System.out.println(node1.getData());
        node1 = node1.getNext();
        System.out.println(node2.getData());
        node1 = node1.getNext();
        System.out.println(node1.getData());

    }

    @Test
    public void check_insert() {
        SingleLinkedList list = new SingleLinkedList();

        list.insert(0, 12);
        list.insert(1,24);
        list.insert(2,48);

        System.out.println(list);

        Assertions.assertEquals(3, list.size());
    }

    @Test
    public void check_addFirstAndLast() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(2);
        list.addFirst(1);
        list.addFirst(0);
        list.addLast(3);
        System.out.println(list);
    }

    @Test
    public void check_getFirstAndLast() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(12);
        list.addLast(24);
        list.addLast(48);

        Assertions.assertEquals(12, list.getFirst());
        Assertions.assertEquals(48, list.getLast());
    }

    @Test
    public void check_getByIndex() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(12);
        list.addLast(24);
        list.addLast(48);

        Assertions.assertEquals(12, list.get(0));
        Assertions.assertEquals(24, list.get(1));
        Assertions.assertEquals(48, list.get(2));
    }

    @Test
    public void check_removeByIndex() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(12);
        list.addLast(24);
        list.addLast(48);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        Assertions.assertEquals(2, list.size());
    }

    @Test
    public  void check_removeFirst() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(12);
        list.addLast(24);
        list.addLast(48);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        Assertions.assertEquals(2, list.size());
    }



}
