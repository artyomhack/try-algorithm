package dataStructure.list.nodelist;

public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public SingleLinkedList() {

    }

    public SingleLinkedList(int data) {
        head = new Node(data, null);
    }

    public void insert(int index, int data) { //O(n)
        Node newNode = new Node(data, null);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        }
        else {
            Node left = head;

            for (int i = 0; i < index - 1; i++)
                left = left.getNext();

            Node right = left.getNext();
            left.setNext(newNode);
            newNode.setNext(right);
        }
        size++;
    }

    public void addFirst(Integer data) { // O(1)
        if (isEmpty()) {
            head = new Node(data, null);
            tail = head;
        }
        else {
            Node node = new Node(data, null);
            Node temp = head;
            head = node;
            node.setNext(temp);
        }
        size++;
    }

    public void addLast(Integer data) { // O(1)
        if (isEmpty()) {
            addFirst(data);
        }
        else {
            Node node = new Node(data, null);
            Node temp = tail;
            tail = node;
            temp.setNext(tail);
            size++;
        }
    }

    public Integer getFirst() { //O(1)
        if (isEmpty())
            throw new NullPointerException("List is null");
        return head.getData();
    }

    public Integer getLast() { //O(1)
        if (isEmpty())
            throw new NullPointerException("List is null");
        return tail.getData();
    }

    public Integer get(int index) {//O(n)
        if (isEmpty())
            throw new NullPointerException("List is null");

        checkIndex(index);

        Node x = head;
        for (int i = 0; i < index; i++)
            x = x.getNext();

        return x.getData();
    }

    public void remove(int index) {//O(n)
        if (isEmpty())
            throw new NullPointerException("List is null");

        checkIndex(index);

        Node left = head;
        for (int i = 0; i < index-1; i++)
            left = left.getNext();

        Node nodeIndex = left.getNext();
        left.setNext(nodeIndex.getNext());
        nodeIndex.setNext(null);
        size--;
    }

    public void removeFirst() {//O(1)
        if (isEmpty())
            throw new NullPointerException("List is null");

        head = head.getNext();
        size--;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (!isElementByIndex(index))
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
    }

    private boolean isElementByIndex(int index) {
        return index >= 0 && index < size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node point = head;
        builder.append("[ ");
        while (point != null) {
            builder.append(point.getData()).append(" ");
            point = point.getNext();
        }
        builder.append("]");
        return builder.toString();
    }
}


