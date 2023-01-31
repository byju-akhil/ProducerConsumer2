package org.example.consumer;

import java.util.concurrent.BlockingQueue;

public class Consumer {
    BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    void consume() throws InterruptedException {
        while (true) {
            String got = queue.take();
            System.out.println(got);
        }
    }
}
