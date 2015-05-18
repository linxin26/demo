package co.solinx.demo.multithread.prosumer;

import java.util.concurrent.locks.Lock;

/**
 * Created by linx on 2015/5/15.
 */
public class Warehouse {

    public int datas;
    private int capacity = 10;
    private int currentCapacity;
    final double temp=555;


    public Warehouse(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public void production() throws InterruptedException {
        synchronized (this) {
            if (currentCapacity < capacity) {

                System.out.println("生产数据，当前库存为：" + currentCapacity);
                datas++;
                currentCapacity++;
                System.out.println(Thread.currentThread().getName() + "生产了" + "一个数据");
                System.out.println("生产完后，当前库存为：" + currentCapacity);
                System.out.println("");
                notifyAll();
            } else {
                System.out.println("库存容量已满，等待消费");
                wait();
            }
        }
    }

    public void consume() {
        synchronized (this) {
            if (currentCapacity > 0) {
                System.out.println("消费数据，当前库存为：" + currentCapacity);
                datas--;
                currentCapacity--;
                System.out.println(Thread.currentThread().getName() + "消费了" + "一个数据");
                System.out.println("消费数据后，当前库存为：" + currentCapacity);
                System.out.println("");
                notifyAll();
            } else {
                System.out.println("库存不足，等待生产");
                try {
                    wait(2000);     //等候2秒
                    if (currentCapacity > 0) {    //2秒后还没有生产则当前没有生产者，需要驱动生产
                        System.out.println(Thread.currentThread().getName() + "消费了" + "一个数据");
                        currentCapacity--;
                        System.out.println("消费数据后，当前库存：" + currentCapacity);
                        System.out.println("");
                    }else{                //消费驱动生产
                        System.out.println("-------------------驱动生产");
                        this.production();

                        System.out.println(Thread.currentThread().getName() + "消费了" + "一个数据");
                        currentCapacity--;
                        System.out.println("消费数据后，当前库存：" + currentCapacity);
                        System.out.println("");
                    }
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
