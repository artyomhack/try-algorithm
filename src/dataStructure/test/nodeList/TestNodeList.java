package dataStructure.test.nodeList;

import dataStructure.list.nodelist.SingleLinkedList;
import dataStructure.list.nodelist.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestNodeList {

    @Test
    public void check_printNodes() {
        Node node1 = new Node(10, null);
        Node node2 = new Node(17, null);
        Node node3 = new Node(21, null);

        Node[] nodes = {node1, node2, node3};

        node1.setNext(node2);
        node2.setNext(node3);

        Node pointer = nodes[0];
        System.out.println(pointer.getData());
        pointer = pointer.getNext();
        System.out.println(pointer.getData());
        pointer = pointer.getNext();
        System.out.println(pointer.getData());
    }

    @Test
    public void check_push() {
        SingleLinkedList list = new SingleLinkedList();
        list.push(10);
        list.push(17);
        list.push(21);
        printList(list);
    }


    private void printList(SingleLinkedList list) {
        System.out.print("[");
        for (Node point = list.getHead(); point != null; point = point.getNext()) {
            System.out.print(" " + point.getData() + " ");
        }
        System.out.print("]");
    }
}
