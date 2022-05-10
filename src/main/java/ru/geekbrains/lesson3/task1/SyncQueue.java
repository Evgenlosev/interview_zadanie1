package ru.geekbrains.lesson3.task1;

public class SyncQueue {
    boolean flag = false;

    synchronized void printPing() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("ping ");
        flag = true;
        notify();
    }

    synchronized void printPong() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("pong");
        flag = false;
        notify();
    }
}
