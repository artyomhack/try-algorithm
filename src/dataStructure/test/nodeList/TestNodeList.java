package dataStructure.test.nodeList;

import dataStructure.list.nodelist.SingleLinkedList;
import dataStructure.list.nodelist.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestNodeList {

    @Test
    public void check_printNodes() {
//        Node node1 = new Node(10, null);
//        Node node2 = new Node(17, null);
//        Node node3 = new Node(21, null);
//
//        Node[] nodes = {node1, node2, node3};
//
//        node1.setNext(node2);
//        node2.setNext(node3);
//
//        Node pointer = nodes[0];
//        System.out.println(pointer.getData());
//        pointer = pointer.getNext();
//        System.out.println(pointer.getData());
//        pointer = pointer.getNext();
//        System.out.println(pointer.getData());

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


}
