package org.example.producer;

import java.util.concurrent.BlockingQueue;

public class Producer {

    private BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void produce() {
        for(int i=0; i<10; ++i) {
            var content = "P"+i;
            System.out.println("Producing "+content);
            queue.offer(content);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        queue.offer("end");
    }
}
