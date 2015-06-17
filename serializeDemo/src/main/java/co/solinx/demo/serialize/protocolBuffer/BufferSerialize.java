package co.solinx.demo.serialize.protocolBuffer;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * Created by linx on 2015/6/17.
 */
public class BufferSerialize {


    public byte[] serialize(RequestProto.Request.Builder request) {
        return request.build().toByteArray();
    }
    public RequestProto.Request  deSerialize(byte[] bytes) throws InvalidProtocolBufferException {
        return RequestProto.Request.parseFrom(bytes);
    }

}
