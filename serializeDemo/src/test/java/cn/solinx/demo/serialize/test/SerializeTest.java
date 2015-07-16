package cn.solinx.demo.serialize.test;

import co.solinx.demo.serialize.data.Request;
import co.solinx.demo.serialize.data.Response;
import co.solinx.demo.serialize.data.TestData;
import co.solinx.demo.serialize.fourest.ForestSerialize;
import co.solinx.demo.serialize.fourest.StringUtil;
import co.solinx.demo.serialize.jdk.JdkSerialize;
import co.solinx.demo.serialize.kryo.KryoSerialize;
import co.solinx.demo.serialize.protocolBuffer.BufferSerialize;
import co.solinx.demo.serialize.protocolBuffer.RequestProto;
import co.solinx.demo.serialize.protocolBuffer.ResponseProto;
import com.google.protobuf.InvalidProtocolBufferException;

import java.io.IOException;
import java.util.Random;

/**
 * 简单分析jdk序列化、Kryo、protoBuf 三种序列化
 * http://kangsg219.iteye.com/blog/904762
 */
public class SerializeTest {

    public static void main(String[] args) {

        Random random = new Random();
        Request request = new Request();
        request.setId(122);
        request.setData("data");
        request.setVersion("version");
        Response response = new Response();
        response.setSn(request.getId());
        response.setResult("result");
        request.setResponse(response);
        request.setBool(false);
        request.setLongL(170l);
        request.setLongv(160);
        request.setSn(150);

        TestData testData=new TestData();

        SerializeTest serialize = new SerializeTest();
        try {
            serialize.jdkSerialize(request);
            System.out.println("---------------------------------------------------------------");
            serialize.kryoTest(request);
            System.out.println("---------------------------------------------------------------");
            serialize.protocolTest();
//            serialize.forestSerialize();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void jdkSerialize(Request request) throws IOException,
            ClassNotFoundException {
        JdkSerialize jdkSerialize = new JdkSerialize();
        byte[] jdkByte = null;
        Request deSerialize = null;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            jdkByte = jdkSerialize.serialize(request);
            deSerialize = (Request) jdkSerialize.deSerialize(jdkByte);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("jdk serialize:" + (endTime - startTime) + "ms");

        System.out.println("bytes size:" + jdkByte.length);
        System.out.println(StringUtil.bytesToString(jdkByte));
        System.out.println(deSerialize);

    }

    public void kryoTest(Request request) {
        KryoSerialize kryoSerialize = new KryoSerialize();
        byte[] kryoByte = null;
        Request kryObj = null;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            kryoByte = kryoSerialize.serialize(request);
            kryObj = (Request) kryoSerialize.deSerialize(kryoByte);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("kryo serialize:" + (endTime - startTime) + "ms");
        System.out.println("bytes size:" + kryoByte.length);
        System.out.println(StringUtil.bytesToString(kryoByte));
//        System.out.println(new String(kryoByte));
        System.out.println(kryObj);
    }

    public void protocolTest(){
        RequestProto.Request.Builder request=RequestProto.Request.newBuilder();
        ResponseProto.Response.Builder response=ResponseProto.Response.newBuilder();
        request.setId(122);
        request.setData("data");
        request.setVersion("version");
        response.setResult("result");
        response.setSn(request.getId());
        request.setResponse(response);
         request.setBoolean(false);
        request.setSn(150);
        request.setLongv(160);
        request.setLongL(170);


        byte[] dataBytes=request.build().toByteArray();
        byte[] datas = new byte[0];
        BufferSerialize buffer=new BufferSerialize();
        RequestProto.Request temp = null;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            datas = buffer.serialize(request);
            try {
                temp = buffer.deSerialize(datas);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("protocol serialize:" + (endTime - startTime) + "ms");
        System.out.println("bytes size:" + datas.length);
        System.out.println(StringUtil.bytesToString(datas));
        System.out.println(temp.toString());

    }

    public void forestSerialize(){
        Request request=new Request();
        request.setId(9999);
        request.setVersion("version");
        request.setData("data");
        request.setResponse(null);
        request.setLongv(99999);
        ForestSerialize forest=new ForestSerialize();
        long startTime = System.currentTimeMillis();
        byte[] dataByte=null;
        Request temp = null;
        for (int i = 0; i < 100000; i++) {
            dataByte = forest.serialize(request);
            temp = (Request) forest.deSerialize(dataByte);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("forest serialize:" + (endTime - startTime) + "ms");
        System.out.println("bytes size:" + dataByte.length);
        System.out.println(StringUtil.bytesToString(dataByte));
        System.out.println(temp.toString());

//        byte[] dataByte= forest.serialize(request);
//        Request temp= (Request) forest.deSerialize(dataByte);
//        System.out.println(temp);
    }

}
