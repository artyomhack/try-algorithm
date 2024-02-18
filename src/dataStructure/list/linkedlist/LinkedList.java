package dataStructure.list.linkedlist;


public class LinkedList {
    private Node head;
    private Node tail;

    private int size = 0;

    public LinkedList() {

    }

    public void insert(int index, int data) { //O(n) в хорошем случае 0(1), но быстрее чем в односвязном списке - O(n/2)
        checkIndex(index);
        if (isEmpty() || index == 0)
            addFirst(data);
        else if (index == size)
            addLast(data);
        else {
            Node newNode = new Node(null, data, null);
            addBefore(index, newNode);
            size++;
        }
    }

    public void addFirst(int data) { //O(1)
        Node newNode = new Node(null, data, null);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else {
            Node temp = head;
            newNode.next = temp;
            temp.prev = temp;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) { //O(1)
        Node newNode = new Node(null, data, null);
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node temp = tail;
            newNode.prev = temp;
            temp.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public Integer get(int index) { //O(n) в хорошем случае O(1)
        if (isEmpty())
            throw new NullPointerException("List is null");

        checkIndex(index);

        Node pointer;
        if (size / 2 > index) {
            pointer = head;
            for (int i = 0; i < index; i++)
                pointer = pointer.next;
            return pointer.data;
        }
        pointer = tail;
        for (int i = size - 1; i > index; i--)
            pointer = pointer.prev;
        return pointer.data;
    }

    public Integer getFirst() { //O(1)
        if (isEmpty())
            throw new NullPointerException("List is null");

        return get(0);
    }

    public Integer getLast() { //O(1)
        if (isEmpty())
            throw new NullPointerException("List is null");

        return get(size - 1);
    }

    public void remove(int index) { //O(n) в хорошем случае O(1)
        if (isEmpty())
            throw new NullPointerException("List is null");
        checkIndex(index);
        if (index == 0)
            removeFirst();
        else if (index == size() - 1)
            removeLast();
        else {
            Node pointer;
            if (size / 2 >= index) { //Поиск со стороны head
                pointer = head;
                for (int i = 0; i < index; i++)
                    pointer = pointer.next;
            }
            else { //Поиск со стороны tail
                pointer = tail;
                for (int i = 0; i < index; i++)
                    pointer = pointer.prev;
            }

            Node left = pointer.prev;
            Node right = pointer.next;

            left.next = right;
            right.prev = left;

            size--;
        }
    }

    public void removeFirst() { // O(1)
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast() { // O(1)
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void addBefore(int index, Node node) {
        if (size / 2 >= index) {
            Node left = head;
            for (int i = 0; i < index - 1; i++)
                left = left.next;

            if (left.next != null) {
                Node right = left.next;
                right.prev = node;
                node.next = right;
            }

            left.next = node;
            node.prev = left;
        } else {
            Node right = tail;

            for (int i = size; i < index - 1; i++)
                right = right.prev;

            if (right.prev == null) {
                node.prev = right;
                right.next = node;
                tail = node;
            } else {
                Node left = right.prev;
                left.next = node;
                node.prev = left;
                node.next = right;
                right.prev = node;
            }
        }
    }

    private void checkIndex(int index) {
        if (!isElementByIndex(index))
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
    }

    private boolean isElementByIndex(int index) {
        return !(index < 0 || index > size());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");
        Node point = head;
        while (point != null) {
            builder.append(point.data).append(" ");
            point = point.next;
        }
        builder.append("]");
        return builder.toString();
    }

    private static class Node {
        private Integer data;
        private Node next;
        private Node prev;

        // [prev|data|next]
        public Node(Node prev, Integer data, Node next) {
            this.next = next;
            this.data = data;
            this.prev = prev;
        }
    }
}
