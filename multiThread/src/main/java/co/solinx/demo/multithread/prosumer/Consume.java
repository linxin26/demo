package co.solinx.demo.multithread.prosumer;

/**
 * Created by linx on 2015/5/15.
 */
public class Consume extends Thread {

    private Warehouse warehouse;
    private int num;

    public Consume(String name, Warehouse warehouse, int num) {
        this.setName(name);
        this.warehouse = warehouse;
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            warehouse.shipment();
        }

    }
}
