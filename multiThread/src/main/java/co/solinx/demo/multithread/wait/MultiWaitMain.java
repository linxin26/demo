package co.solinx.demo.multithread.wait;

/**
 * Created by linx on 2015/5/14.
 */
public class MultiWaitMain extends Thread {

    private ComputeThread compute;

    public MultiWaitMain(ComputeThread thread) {
        this.compute = thread;
    }

    public static void main(String[] args) throws InterruptedException {
        ComputeThread computeA = new ComputeThread("A");
        MultiWaitMain waitA = new MultiWaitMain(computeA);
        MultiWaitMain waitB = new MultiWaitMain(computeA);

        waitA.start();
        waitB.start();

         Thread.sleep(20);
        computeA.start();
    }

    @Override
    public void run() {


        try {
                synchronized (compute) {
                    System.out.println("等待" + compute.getTaskName() + "计算结果");
                    compute.wait();
                }
            System.out.println(compute.getTaskName()+" 计算结果为："+compute.getTotal());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
