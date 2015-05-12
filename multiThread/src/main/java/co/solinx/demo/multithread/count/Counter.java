package co.solinx.demo.multithread.count;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by linx on 2015-05-12.
 */
public class Counter {

    private int count = 0;

    public  void increment() {
        ++count;
    }


    public int getCount() {
        return count;
    }
}