package ru.geekbrains.lesson3.task2;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 50; i++) {
            CounterThread ct = new CounterThread(counter);
            ct.start();
        }
        Thread.sleep(1000);
        System.out.println("Counter:" + counter.getCounter());
    }
}
