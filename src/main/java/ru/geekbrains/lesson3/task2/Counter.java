package ru.geekbrains.lesson3.task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private long counter;
    private Lock lock;

    public Counter() {
        counter = 0L;
        lock = new ReentrantLock();
    }

    public void increaseCounter() {
        lock.lock();
        counter++;
        lock.unlock();
    }

    public long getCounter() {
        return counter;
    }

}
