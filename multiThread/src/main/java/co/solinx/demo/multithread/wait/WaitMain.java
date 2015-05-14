package co.solinx.demo.multithread.wait;

/**
 * Created by linx on 2015/5/14.
 */
public class WaitMain {


    public static void main(String[] args) throws InterruptedException {
        ComputeThread compute = new ComputeThread("computeA");
        ComputeThread computB=new ComputeThread("computeB");

        System.out.println("开始计算");
        synchronized (compute) {
            //waitMain等待compute计算完成
            compute.start();
            compute.wait();
        }
        synchronized(computB){
            //waitMain等待computeB计算完成
            computB.start();
            computB.wait();
        }



//        compute.join();
        System.out.println(computB.getTaskName()+"计算结果：" + computB.getTotal());
        System.out.println(compute.getTaskName()+"计算结果：" + compute.getTotal());

    }

}
