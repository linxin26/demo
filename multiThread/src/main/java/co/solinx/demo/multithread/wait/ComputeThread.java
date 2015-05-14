package co.solinx.demo.multithread.wait;

/**
 * Created by linx on 2015/5/14.
 */
public class ComputeThread extends Thread {


    private int total = 0;
   private String taskName;

    public ComputeThread(String name ) {
        taskName = name;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            notifyAll();
        }
    }

    public int getTotal() {
        return total;
    }


    public String getTaskName() {
        return taskName;
    }
}
