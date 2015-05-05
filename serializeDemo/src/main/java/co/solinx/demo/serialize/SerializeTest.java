package co.solinx.demo.serialize;

import java.io.IOException;
import java.util.Random;

public class SerializeTest {

    public static void main(String[] args) {

        Random random = new Random();
        Request request = new Request();
        request.setId(random.nextInt());
        request.setData("data body");
        request.setVersion("V2.1");
        Response response = new Response();
        response.setSn(request.getId());
        response.setResult("response result");
        request.setResponse(response);

        SerializeTest serialize = new SerializeTest();
        try {
            serialize.jdkSerialize(request);
            serialize.kryoTest(request);

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
        System.out.println(kryObj);
    }

}
