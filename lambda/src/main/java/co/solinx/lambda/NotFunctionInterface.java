package co.solinx.lambda;

/**
 * Created by linx on 2015/8/5.
 */
@FunctionalInterface
public interface NotFunctionInterface {

    int test(int a);

    default void print(){
        System.out.println("default method");
    }

    static void staticMethod(){
        System.out.println("staticMethod");
    }

}
