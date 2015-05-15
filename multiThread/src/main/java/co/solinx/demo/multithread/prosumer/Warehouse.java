package co.solinx.demo.multithread.prosumer;

/**
 * Created by linx on 2015/5/15.
 */
public class Warehouse {

    public int datas;
    private int capacity = 10;
    private int currentCapacity;

    public Warehouse(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public void production() throws InterruptedException {
        synchronized (this) {
            if (currentCapacity < capacity) {

                System.out.println("当前库存：" + currentCapacity);
                datas++;
                currentCapacity++;
                System.out.println(Thread.currentThread().getName() + "生产了" + "一个数据");
                System.out.println("当前库存：" + currentCapacity);
                notifyAll();
            } else {
                System.out.println("容量不足，等待消费");
                wait();
            }
        }
    }

    public void consume() {
        synchronized (this) {
            if (currentCapacity > 0) {
                System.out.println("当前库存：" + currentCapacity);
                datas--;
                currentCapacity--;
                System.out.println(Thread.currentThread().getName() + "消费了" + "一个数据");
                System.out.println("当前库存：" + currentCapacity);
                notifyAll();
            } else {
                System.out.println("库存不足，等待生产");
                try {
                    wait();
                    System.out.println(Thread.currentThread().getName() + "消费了" + "一个数据");
                    currentCapacity--;
                    System.out.println("当前库存：" + currentCapacity);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
