package co.solinx.demo.serialize.fourest;

import co.solinx.demo.serialize.data.Request;

import java.lang.reflect.Field;

/**
 * Created by linx on 2015/6/17.
 * forestSerialize序列化
 */
public class ForestSerialize {

    public static void main(String[] args) {

        Request request = new Request();
        request.setId(10);
        request.setVersion("version");
        request.setData("data");
        request.setResponse(null);
        ForestSerialize serialize = new ForestSerialize();
        serialize.serialize(request);

    }

    public byte[] serialize(Object obj) {
//        Class.forName(obj.getClass().getCanonicalName())

        byte[] objByte = new byte[70];
        int currentLength = 0;

        Class classz = obj.getClass();
        String className=classz.getCanonicalName();
//        System.out.println(classz.getSimpleName());
//        System.out.println(className);
//        System.out.println();
//        System.out.println(classz.getMethods().length);
        System.arraycopy(className.getBytes(), 0, objByte, currentLength, className.getBytes().length);
        currentLength+=className.getBytes().length;
//        System.out.println("classBytes length : "+currentLength);
        //遍历每个字段
        for (Field field : classz.getDeclaredFields()) {
            field.setAccessible(true);
//            System.out.println(field.getName());
            try {
//                System.out.println(field.get(obj));

//                System.out.println(field.getType().getSimpleName());
                String typeName = field.getType().getSimpleName();
                //根据对应的数据类型转为Byte数组
                if (typeName.equals("int")) {
                    byte[] temp = TypeToByteArray.intToByteArr(field.getInt(obj));
//                    System.out.println(StringUtil.bytesToString(temp));
                    System.arraycopy(temp, 0, objByte, currentLength, temp.length);
                    currentLength += temp.length;
                } else if (typeName.equals("long")) {

                    byte[] temp = TypeToByteArray.longToByteArr(field.getLong(obj));
//                    System.out.println(StringUtil.bytesToString(temp));
                    System.arraycopy(temp, 0, objByte, currentLength, temp.length);
                    currentLength += temp.length;

                } else if (typeName.equals("Object")) {
                    byte[] temp = field.get(obj).toString().getBytes();
//                    System.out.println(StringUtil.bytesToString(temp));
                    System.arraycopy(temp, 0, objByte, currentLength, temp.length);

                    currentLength += temp.length;

                } else if (typeName.equals("String")) {
                    byte[] temp = field.get(obj).toString().getBytes();
//                    System.out.println(StringUtil.bytesToString(temp));
                    System.arraycopy(temp, 0, objByte, currentLength, temp.length);
                    currentLength += temp.length;
                }
//                System.out.println();

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
//        System.out.println(StringUtil.bytesToString(objByte));
        this.deSerialize(objByte);
        return objByte;
    }

    public Object deSerialize(byte[] data){

        Request request=new Request();
        byte[] classNameByte=new byte[37];
        System.arraycopy(data,0,classNameByte,0,37);
        String className=new String(classNameByte);
//        System.out.println(className);

        byte[] serializeByte=new byte[4];
        System.arraycopy(data,45,serializeByte,0,4);
//        System.out.println(StringUtil.bytesToString(serializeByte));
        int serializeID=TypeToByteArray.hBytesToInt(serializeByte);
        Object cObject = null;
        try {
            Class obj= Class.forName(className);
             cObject=obj.newInstance();

            Field[] fields= cObject.getClass().getDeclaredFields();
//            System.out.println(fields.length);
            for (Field field:fields) {
                field.setAccessible(true);
                String typeName = field.getType().getSimpleName();
                if(typeName.equals("int")){
                    field.set(cObject,serializeID);
                }
            }
//            System.out.println(cObject);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cObject;
    }

}
