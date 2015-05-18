package co.solinx.demo.multithread.prosumer;

/**
 * Created by linx on 2015/5/15.
 */
public class Generate  extends Thread{

    private Warehouse warehouse;
    private int num;

    public Generate(String name, Warehouse warehouse,int num) {
        this.setName(name);
        this.warehouse = warehouse;
        this.num=num;
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < num; i++) {
                warehouse.production();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
