package org.example;

import org.example.consumer.Consumer;
import org.example.producer.Producer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var queue = new LinkedBlockingQueue<String>();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        var executorService = Executors.newFixedThreadPool(10);

        var f1 = executorService.submit(producer::produce);
        var f2 = executorService.submit(consumer::consume);

        f1.get();
        f2.get();
    }
}