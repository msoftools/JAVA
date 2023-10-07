import java.io.UnsupportedEncodingException;

import org.apache.zookeeper.KeeperException;

public class GetChildrenInfo {
    
            public static void main(String[] args) throws InterruptedException, KeeperException, UnsupportedEncodingException {
 
                String host = "localhost:2181";
                ZooKeeperConnection zk =  new ZooKeeperConnection();
                ZooKeeperConnection.zkStartConnection(host);            
                String path = "/mariotest";
 
                System.out.println(zk.zoo.getChildren(path,false));
 
            }
            




            
}
