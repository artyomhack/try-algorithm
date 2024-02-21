package dataStructure.heap;

public class MinHeap {
    private int[] heapData;
    private int size;

    public MinHeap(int maxSize) {
        this.size = 0;
        heapData = new int[maxSize + 1];
        heapData[0] = Integer.MIN_VALUE;
    }

    public void insert(int element) {
        heapData[++size] = element;
        siftUp(size);
    }

    public int removeMin() {
        int result = heapData[0];
        heapData[0] = heapData[--size];
        siftDown();
        return result;
    }

    public int size() {
        return size;
    }

    public int[] data() {
        return heapData;
    }

    private void siftUp(int position) {//Меняемся с вершиной родителя, если основное свойство нарушен(проходимся снизу вверх)
        int parent = getParent(position);
        while (position > 0 && heapData[parent] > heapData[position]) {
            swap(heapData[parent], heapData[position]);
            position = parent;
            parent = getParent(position);
        }
    }

    private void siftDown() {
        int position = 0;
        while (true) { //Рассматриваем какой из дочерних узлов меньше, делаем обмен элементами
            int j = position;

            if (leftChild(position) < size && heapData[leftChild(position)] < heapData[j])
                j = leftChild(position);
            if (rightChild(position) < size && heapData[rightChild(position)] < heapData[j])
                j = rightChild(position);

            if (j == position)
                break;

            swap(heapData[position], heapData[j]);
            position = j;
        }
    }

    private void swap(int position, int element) {
        int temp = position;
        position = element;
        element = temp;
    }

    private int getParent(int position) {//Вытаскиваем узел по позиции нашего элемента
        return position / 2;
    }

    private int leftChild(int position) {// Вытаскиваем позицию дочернего элемента слева
        return  position * 2;
    }

    private int rightChild(int position) { // Вытаскиваем позицию дочернего элемента справа
        return position * 2 + 1;
    }

}
