package co.solinx.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

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
             a++;
            a=a+10;
            return a;
        };

        System.out.println(notFunctionInterface.test(112));
        notFunctionInterface.print();
        NotFunctionInterface.staticMethod();

        BinaryOperator<Long> addLong=(x,y)->{
            Long l=x+y;
            return l;
        };

        BinaryOperator<Integer> addOperator = (x, y) -> x+y;
        System.out.println(addOperator.apply(3,4));

        System.out.println(addLong.apply(1l,3l));

        System.out.println("");
        ArrayList<String> arry=new ArrayList();
        arry.add("a");
        arry.add("b");
        arry.add("1");
        arry.forEach((String temp)->System.out.println(temp));
    }


}
