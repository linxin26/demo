package co.solinx.demo.multithread;

import co.solinx.demo.multithread.model.DataQueue;

/**
 * Created by linx on 2015/5/6.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        final DataQueue queue = new DataQueue();

        Thread operationA = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 15; i++) {
                    queue.push(String.valueOf(i));
                }
            }
        }, "operationA");

        Thread operationB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 15; i < 30; i++) {
                    queue.push(String.valueOf(i));
                }
            }
        }, "operationB");

        operationA.start();
        operationA.join();
        operationB.start();


//        for (int i = 0; i < 30; i++) {
//            queue.push(String.valueOf(i));
//        }
//        while (Thread.activeCount() > 2) {
////            System.out.println(Thread.activeCount());
//            Thread.yield();
//        }

        operationB.join();

        for (int i = 0; i < 30; i++) {
            System.out.println(queue.pull());
        }

    }

}
