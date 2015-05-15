package co.solinx.demo.multithread.prosumer;

/**
 * Created by linx on 2015/5/15.
 */
public class Generate  extends Thread{
    private Warehouse warehouse;

    public Generate(String name, Warehouse warehouse) {
        this.setName(name);
        this.warehouse = warehouse;
    }


    @Override
    public void run() {
        try {
            warehouse.production();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
