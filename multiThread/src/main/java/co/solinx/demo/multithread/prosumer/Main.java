package co.solinx.demo.multithread.prosumer;

/**
 * Created by linx on 2015/5/15.
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {

        Warehouse warehouse = new Warehouse(0);

        Consume consume = new Consume("consume", warehouse,8);

//        Production production = new Production("production", warehouse,5);
        Generate generate=new Generate("production",warehouse,12);

        Consume consume2 = new Consume("consume2", warehouse,2);
//        Production production2 = new Production("production2", warehouse,1);

        consume.start();
        generate.start();
//        production.start();
//        consume2.start();
//        production2.start();


//        production.join();
//        consume.join();


    }

}
