import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.test.TestingServer;

import java.io.File;
import java.nio.file.Path;

/**
 * Created by lin8x_000 on 2015-08-09.
 */
public class CuratorTestingServer {

    static String path="/zookeeper";


    public static void main(String[] args) throws Exception {
//        TestingServer server=new TestingServer(2181,new File("d:/data"));
        CuratorFramework client= CuratorFrameworkFactory.builder().connectString("127.0.0.1").sessionTimeoutMs(5000)
                .retryPolicy(new ExponentialBackoffRetry(1000,3))
                .build();
        client.start();
        System.out.println(client.getChildren().forPath(path));
        client.create().inBackground((curatorFramework, curatorEvent) -> System.out.println("t: "+curatorEvent)).forPath("/test", "testing".getBytes());
        System.out.println(new String(client.getData().forPath("/test")));
//        server.close();
        for (int i = 0; ; i++) {

        }
    }

}
