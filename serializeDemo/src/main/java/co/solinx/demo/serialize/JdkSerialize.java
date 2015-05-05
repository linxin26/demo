package co.solinx.demo.serialize;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JdkSerialize {

    /**
     * 序列化
     *
     * @param obj
     * @return
     * @throws IOException
     */
    public byte[] serialize(Object obj) throws IOException {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ObjectOutputStream objOutput = new ObjectOutputStream(output);
        objOutput.writeObject(obj);
        return output.toByteArray();
    }

    /**
     * 反序列化
     *
     * @param bytes
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deSerialize(byte[] bytes) throws IOException,
            ClassNotFoundException {
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        ObjectInputStream objInput = new ObjectInputStream(input);
        return objInput.readObject();
    }

}
