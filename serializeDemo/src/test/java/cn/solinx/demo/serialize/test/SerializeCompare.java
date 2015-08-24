package cn.solinx.demo.serialize.test;

import co.solinx.demo.serialize.data.TestData;
import co.solinx.demo.serialize.fourest.StringUtil;
import co.solinx.demo.serialize.jdk.JdkSerialize;
import co.solinx.demo.serialize.kryo.KryoSerialize;
import co.solinx.demo.serialize.protocolBuffer.BufferSerialize;
import co.solinx.demo.serialize.protocolBuffer.TestDataProto;
import com.google.protobuf.InvalidProtocolBufferException;

import java.io.IOException;

/**
 * Created by linx on 2015/7/16.
 */
public class SerializeCompare {

    public static void main(String[] args){
        TestData testData=new TestData();
        testData.setSn(10);

        SerializeCompare serialize = new SerializeCompare();
        try {
            serialize.jdkSerialize(testData);
            System.out.println("---------------------------------------------------------------");
            serialize.kryoTest(testData);
            System.out.println("---------------------------------------------------------------");
            serialize.protocolTest();
//            serialize.forestSerialize();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void jdkSerialize(TestData testData) throws IOException,
            ClassNotFoundException {
        JdkSerialize jdkSerialize = new JdkSerialize();
        byte[] jdkByte = null;
        TestData deSerialize = null;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            jdkByte = jdkSerialize.serialize(testData);
            deSerialize = (TestData) jdkSerialize.deSerialize(jdkByte);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("jdk serialize:" + (endTime - startTime) + "ms");

        System.out.println("bytes size:" + jdkByte.length);
        System.out.println(StringUtil.bytesToString(jdkByte));
//        System.out.println(deSerialize);

    }

    public void kryoTest(TestData testData) {
        KryoSerialize kryoSerialize = new KryoSerialize();
        byte[] kryoByte = null;
        TestData kryObj = null;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            kryoByte = kryoSerialize.serialize(testData);
            kryObj = (TestData) kryoSerialize.deSerialize(kryoByte);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("kryo serialize:" + (endTime - startTime) + "ms");
        System.out.println("bytes size:" + kryoByte.length);
        System.out.println(StringUtil.bytesToString(kryoByte));
////        System.out.println(new String(kryoByte));
//        System.out.println(kryObj);
    }

    public void protocolTest(){

        TestDataProto.TestData.Builder testData=TestDataProto.TestData.newBuilder();
        testData.setSn(10);

        byte[] datas=null;
        TestDataProto.TestData temp = null;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            datas = testData.build().toByteArray();
            try {
                temp =TestDataProto.TestData.parseFrom(datas);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("protocol serialize:" + (endTime - startTime) + "ms");
        System.out.println("bytes size:" + datas.length);
        System.out.println(StringUtil.bytesToString(datas));
//        System.out.println(temp);

    }

}
