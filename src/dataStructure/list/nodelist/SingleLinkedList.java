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

    public void addFirst(Integer data) {
        Node node = new Node(data, null);
        Node temp = head;
        head = node;
        node.setNext(temp);
        size++;
    }

    public void addLast(Integer data) {
        if (head == null) {
            head = new Node(data, null);
            tail = head;
        }
        else {
            Node node = new Node(data, null);
            Node temp = tail;
            tail = node;
            temp.setNext(tail);
        }
        size++;
    }

    public Integer getFirst() {
        if (isEmpty())
            throw new NullPointerException("List is null");
        return head.getData();
    }

    public Integer getLast() {
        if (isEmpty())
            throw new NullPointerException("List is null");
        return tail.getData();
    }

    public Integer get(int index) {
        if (isEmpty())
            throw new NullPointerException("List is null");

        checkIndex(index);

        Node x = head;
        for (int i = 0; i < index; i++)
            x = x.getNext();

        return x.getData();
    }

    public void remove(int index) {
        if (isEmpty())
            throw new NullPointerException("List is null");

    }

    public void removeFirst() {
        if (isEmpty())
            throw new NullPointerException("List is null");

        head = head.getNext();
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NullPointerException("List is null");

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


