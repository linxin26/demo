package co.solinx.demo.serialize.kryo;

import co.solinx.demo.serialize.data.Request;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import java.io.ByteArrayOutputStream;

public class KryoSerialize {
    Kryo kryo = new Kryo();

    public byte[] serialize(Object obj) {

        ByteArrayOutputStream byteOutput=new ByteArrayOutputStream();
        Output output=new Output(byteOutput);
        kryo.writeClassAndObject(output,obj);
        output.flush();
//        Output out = new Output(200);
//        kryo.writeObject(out, obj);
        return byteOutput.toByteArray();
    }

    public Object deSerialize(byte[] data) {
        Input input = new Input(data);
        return kryo.readClassAndObject(input);

    }

}
