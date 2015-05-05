package co.solinx.demo.thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by Administrator on 2015/5/4.
 */
public class TestServer {

    public static void main(String[] args){
//        reqService.Processor processor=new reqService.Processor(new RequestServiceImpl());

        try {
            TServerTransport serverTransport=new TServerSocket(19090);

            TProtocolFactory  protocol =new TCompactProtocol.Factory();
            TProcessor processor=new reqService.Processor(new RequestServiceImpl());
            TServer server=new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).protocolFactory(protocol).processor(processor));
            System.out.println("start server on port 19090");
server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }


    }
}
