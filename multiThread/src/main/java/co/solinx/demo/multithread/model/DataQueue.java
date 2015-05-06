package co.solinx.demo.multithread.model;

/**
 * Created by linx on 2015/5/6.
 */
public class DataQueue {

    private Object[] data;
    private int capacity = 10;   //默认容量10
    private int index = 0;

    public DataQueue() {
        data = new Object[capacity];
    }

    public DataQueue(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public void push(Object item) {
        System.out.println(Thread.currentThread().getName());
        this.enlarge();
        data[index++] = item;
    }

    public void enlarge() {
        if (index == capacity) {
            capacity += capacity;

            Object[] tempData = new Object[index];
            System.arraycopy(data, 0, tempData, 0, index);
            data = new Object[capacity];
            System.arraycopy(tempData, 0, data, 0, index);
            System.out.println("enlarge capacity " + index + " to " + capacity);
        }

    }

    public Object pull() {
        Object result = data[index - 1];
        index--;
        return result;
    }


}
