package co.solinx.demo.multithread.prosumer;

/**
 * Created by linx on 2015/5/15.
 */
public class Consume extends Thread {

    private Warehouse warehouse;

    public Consume(String name, Warehouse warehouse) {
        this.setName(name);
        this.warehouse = warehouse;
    }

    @Override
    public void run() {

        warehouse.consume();
    }
}
