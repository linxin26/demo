package co.solinx.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linx on 2015/8/5.
 */
public class BaseLambda {


    public static void main(String[] args) {


        Runnable one = () -> {
            System.out.println("thread start");
        };
        one.run();

        Runnable primitive=new Runnable() {
            @Override
            public void run() {
                System.out.println("inner class");
            }
        };

        NotFunctionInterface notFunctionInterface=(a)->{
            System.out.println(a);
        };

        notFunctionInterface.test(112);
        notFunctionInterface.print();
        NotFunctionInterface.staticMethod();

        ArrayList<String> arry=new ArrayList();
        arry.add("a");
        arry.add("b");
        arry.add("1");
        arry.forEach((String temp)->System.out.println(temp));
    }


}
