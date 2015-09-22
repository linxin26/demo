package co.solinx.zookeeper;

import org.apache.curator.CuratorZookeeperClient;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.apache.curator.retry.RetryOneTime;
import org.apache.zookeeper.CreateMode;

/**
 * Created by linx on 2015/8/12.
 */
public class zooServer {

    public static void main(String[] args) throws Exception {
//        CuratorZookeeperClient client=new CuratorZookeeperClient("127.0.0.1:2181",3000,5000,null,null);
//        client.start();
        RetryPolicy retryPolicy=new RetryOneTime(5000);
        CuratorFramework curator= CuratorFrameworkFactory.newClient("127.0.0.1:2181",3000,5000, retryPolicy);
        curator.start();
        curator.create().withMode(CreateMode.PERSISTENT_SEQUENTIAL).forPath("/solinx", "solinx".getBytes());
        curator.create().withMode(CreateMode.PERSISTENT_SEQUENTIAL).forPath("/linx","linx".getBytes());
        while(true){

        }
    }

}
