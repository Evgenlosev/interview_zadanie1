package ru.geekbrains.lesson2;

import java.util.LinkedList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        MyLinkedList<String > myLinkedList= new MyLinkedList<>();
        myLinkedList.printAll();

        myLinkedList.add("0");
        myLinkedList.add("1");
        myLinkedList.add("2");
        myLinkedList.add("3");
        myLinkedList.add("4");
        myLinkedList.add("5");
        myLinkedList.add("6");
        myLinkedList.add("7");


        System.out.println(myLinkedList.remove(0));
        myLinkedList.printAll();
        System.out.println(myLinkedList.remove(3));
        myLinkedList.printAll();
        System.out.println(myLinkedList.remove("2"));
        myLinkedList.printAll();
        System.out.println(myLinkedList.remove("0"));
        myLinkedList.printAll();
        System.out.println(myLinkedList.contains("3"));
        System.out.println(myLinkedList.contains("2"));

        myLinkedList.clear();

        myLinkedList.printAll();


//        LinkedList<String> fg = new LinkedList<>();
//        System.out.println(fg.remove(0));
//        System.out.println(fg.toArray());

    }
}
