package org.example.producer;

import java.util.concurrent.BlockingQueue;

public class Producer {

    private BlockingQueue<String> queue;
    private int c = 0;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    void produce() {
        queue.offer("P"+c);
        ++c;
    }
}
