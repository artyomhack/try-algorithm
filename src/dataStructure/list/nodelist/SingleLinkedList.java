package dataStructure.list.nodelist;

public class SingleLinkedList  {
    private Node head;
    private int size = 0;

    public SingleLinkedList() {

    }

    public SingleLinkedList(int data) {
        head = new Node(data, null);
    }

    public void push(Integer data) {
        Node newNode;
        if (isEmpty())
            head = new Node(data, null);
        else {
            newNode = new Node(data, null);
            Node temp = head;
            head = newNode;
            head.setNext(temp);
        }
        size++;
    }

    public Integer pop() {
        Node x = head;
        while (!isEmpty()) {
            if (x.getNext() == null) {
                Integer data = x.getData();
                x = null;
                return data;
            }
        }
        throw new IllegalArgumentException("SingleLinkedList is empty");
    }

    public Integer peek() {
        Node x = head;
        while (!isEmpty()) {
            if (x.getNext() == null) {
                return x.getData();
            }
        }
        throw new IllegalArgumentException("SingleLinkedList is empty");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public Node getHead() {
        return head;
    }
}

