package co.solinx.demo.multithread.count;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by linx on 2015-05-12.
 */
public class Counter {

    private int count = 0;
    Lock lock=new ReentrantLock();

    public synchronized void increment() {
//        lock.lock();
        try {
            ++count;
        }finally {
//            lock.unlock();
        }

    }


    public int getCount() {
        return count;
    }
}
