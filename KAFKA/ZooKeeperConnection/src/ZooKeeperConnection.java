import java.io.IOException;
        import java.io.UnsupportedEncodingException;
        import java.util.List;
 
        import org.apache.zookeeper.CreateMode;
        import org.apache.zookeeper.KeeperException;
        import org.apache.zookeeper.WatchedEvent;
        import org.apache.zookeeper.Watcher;
        import org.apache.zookeeper.ZooDefs;
        import org.apache.zookeeper.ZooKeeper;
        import org.apache.zookeeper.data.ACL;
        import org.apache.zookeeper.data.Stat;
 
        public class ZooKeeperConnection {
 
            static ZooKeeper zoo;
 
            public static void main(String[] args) throws InterruptedException, KeeperException, UnsupportedEncodingException {
 
                String host = "localhost:2181";
 
                zkStartConnection(host);
                
                String path = "/td";
 
                //System.out.println(zoo.exists(path, true));
 
            }
 
            public static void zkStartConnection(String hostname) {
 
                try {
 
                    zoo = new ZooKeeper(hostname, 1000, new Watcher(){
 
                        @Override
                        public void process(WatchedEvent event) {
 
                            System.out.println(event.getState());
 
                        }
 
                    });
 
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
 
        }