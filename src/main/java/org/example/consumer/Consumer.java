package org.example.consumer;

import java.util.concurrent.BlockingQueue;

public class Consumer {
    BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void consume()  {
        try {
            while (true) {
                String got = queue.take();
                if (got.equals("end")) {
                    break;
                }
                System.out.println("consumed "+ got);
            }
        } catch (Exception e) {

        }
    }
}
