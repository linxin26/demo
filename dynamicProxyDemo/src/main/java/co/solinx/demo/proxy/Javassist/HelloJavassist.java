package co.solinx.demo.proxy.Javassist;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;
import javassist.CtNewMethod;

public class HelloJavassist {

	public static void main(String[] args) {
		ClassPool pool = ClassPool.getDefault();
		CtClass hello = pool.makeClass("hello");
		try {

			CtMethod method = CtNewMethod.make(
					"public void hi(){ System.out.println(888); }", hello);
			hello.addMethod(method);
			CtField f = new CtField(CtClass.intType, "num", hello);
			hello.addField(f);
			Class clazz;
			clazz = hello.toClass();
			Object obj = clazz.newInstance();
			System.out.println(obj);

		} catch (CannotCompileException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
