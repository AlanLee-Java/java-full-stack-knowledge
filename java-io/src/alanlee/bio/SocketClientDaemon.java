package alanlee.bio;

import java.util.concurrent.CountDownLatch;

/**
 * 模拟20个客户端并发请求，服务器端使用单线程
 * @author AlanLee
 * @date 2022-12-07
 */
public class SocketClientDaemon {

    public static void main(String[] args) throws Exception {
        Integer clientNumber = 20;
        CountDownLatch countDownLatch = new CountDownLatch(clientNumber);

        //分别开始启动这20个客户端
        for(int index = 0 ; index < clientNumber ; index++ , countDownLatch.countDown()) {
            SocketClientRequestThread client = new SocketClientRequestThread(countDownLatch, index);
            new Thread(client).start();
        }

        //这个wait不涉及到具体的实验逻辑，只是为了保证守护线程在启动所有线程后，进入等待状态
        synchronized (SocketClientDaemon.class) {
            SocketClientDaemon.class.wait();
        }
    }

}