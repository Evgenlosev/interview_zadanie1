package ru.geekbrains.lesson3.task1;

public class MainApp {
    public static void main(String[] args) {
        SyncQueue syncQueue = new SyncQueue();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    syncQueue.printPing();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    syncQueue.printPong();
                }
            }
        }).start();
    }

}
