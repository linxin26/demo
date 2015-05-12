package co.solinx.demo.multithread.count;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by linx on 2015-05-12.
 */
public class AtomicCounter {

    private AtomicInteger count=new AtomicInteger();
    public  void increment() {
        count.incrementAndGet();
    }


    public AtomicInteger getCount() {
        return count;
    }
}
