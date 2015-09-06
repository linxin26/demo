package co.solinx.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Created by linx on 2015/8/5.
 */
public class BaseLambda {


    public static void main(String[] args) {


        Runnable one = () -> {
            System.out.println("thread start");
        };
        one.run();

        Runnable primitive = new Runnable() {
            @Override
            public void run() {
                System.out.println("inner class");
            }
        };

        NotFunctionInterface notFunctionInterface = (a) -> {
            System.out.println(a);
        NotFunctionInterface notFunctionInterface=(a)->{
             a++;
            a=a+10;
            return a;
        };

        System.out.println(notFunctionInterface.test(112));
        notFunctionInterface.print();
        NotFunctionInterface.staticMethod();

        ArrayList<String> arry = new ArrayList();
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
        arry.forEach((String temp) -> System.out.println(temp));

        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(String.valueOf(i));
        }

        System.out.println(System.currentTimeMillis());

//        arrayList.forEach((String temp) -> {
//            String tmp = temp;
//        });
        long startTIme = System.currentTimeMillis();
        arrayList.stream().filter(num -> num.equals("99999")).forEach(temp -> System.out.println(temp));
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTIme));


//        arrayList.parallelStream().forEach(temp -> {
//            String tmp = temp;
//        });

        startTIme = System.currentTimeMillis();
        arrayList.parallelStream().filter(num -> num.equals("99999")).forEach(temp -> System.out.println(temp));
        endTime = System.currentTimeMillis();
        System.out.println("ParallelStream Time: " + (endTime - startTIme));

        System.out.println("----------------   forEach");
        String[] array = {"a", "b", "c"};     //外部变量
        for (String i : array) {
            Stream.of(array).map(item -> {
                item = item + i;
                return item;
            }).forEach(System.out::println);
        }

         NotFunctionInterface fun=System.out::println;   //方法引用
        fun.test(2);
        fun.print();

        ConstructorFunInterface constructor=ArrayList::new;
        ConstructorFunInterface funInterface=x->System.out.print(x);
        constructor.test(new ArrayList());

    }
    //lambda   1、引用变量、2、方法引用，构造方法引用
}
