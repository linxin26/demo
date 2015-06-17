package co.solinx.demo.serialize.kryo;

import co.solinx.demo.serialize.data.Request;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

public class KryoSerialize {
    Kryo kryo = new Kryo();

    public byte[] serialize(Object obj) {

        Output out = new Output(200);
        kryo.writeObject(out, obj);
        return out.toBytes();
    }

    public Object deSerialize(byte[] data) {
        Input input = new Input(data);
        return kryo.readObject(input, Request.class);

    }

}
