package co.solinx.demo.multithread.count;

/**
 * Created by linx on 2015-05-12.
 */
public class CountThread extends Thread {

    private Counter counter;

    public CountThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            counter.increment();
        }
    }
}
