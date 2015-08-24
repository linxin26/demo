package co.solinx.demo.multithread.count;

/**
 * Created by linx on 2015-05-12.
 */
public class CountMain {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        AtomicCounter atomicCounter=new AtomicCounter();

        CountThread t1 = new CountThread(counter);
        CountThread t2 = new CountThread(counter);

        t1.start();
        t2.start();
//        while(Thread.activeCount()>2){
//
//        }
        t1.join();
        t2.join();
        System.out.println("计数器："+counter.getCount());
    }

}
