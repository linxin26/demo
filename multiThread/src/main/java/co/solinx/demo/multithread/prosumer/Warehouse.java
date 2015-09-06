package co.solinx.demo.multithread.prosumer;

/**
 * Created by linx on 2015/5/15.
 */
public class Warehouse {

    private int capacity = 10;
    private int currentCapacity;


    public Warehouse(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public void stock() throws InterruptedException {
        synchronized (this) {
            if (currentCapacity < capacity) {

                System.out.println("仓库进货，当前库存为：" + currentCapacity);
                currentCapacity++;
                System.out.println(Thread.currentThread().getName() + "进货完后 当前库存为：" + currentCapacity+"\n");
                notifyAll();
            } else {
                System.out.println("库存容量已满，等待出货");
                wait();
                System.out.println("仓库进货，当前库存为：" + currentCapacity);
                currentCapacity++;
                System.out.println(Thread.currentThread().getName() + "进货完后 当前库存为：" + currentCapacity+"\n");
            }
        }
    }

    public void shipment() {
        synchronized (this) {
            if (currentCapacity > 0) {
                System.out.println("仓库出货，当前库存为：" + currentCapacity);
                currentCapacity--;
                System.out.println(Thread.currentThread().getName() + "出货一个产品后，当前库存为：" + currentCapacity+"\n");
                notifyAll();
            } else {
                System.out.println("仓库出货，库存不足，等待进货");
                try {
                    wait(2000);     //等候2秒
                    if (currentCapacity > 0) {    //2秒后还没有生产则当前没有生产者，需要驱动生产
                        System.out.println(Thread.currentThread().getName() + "出货一个产品后，当前库存为：" + currentCapacity+"\n");
                        currentCapacity--;

                    } else {                //消费驱动生产
                        System.out.println("-------------------主动进货");
                        this.stock();

                        System.out.println(Thread.currentThread().getName() + "出货一个产品后，当前库存为：" + currentCapacity+"\n");
                        currentCapacity--;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
