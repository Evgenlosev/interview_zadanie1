package ru.geekbrains.lesson2;

import java.util.ArrayList;
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
        System.out.println(myLinkedList.indexOf("5"));
        System.out.println(myLinkedList.indexOf("7"));
        System.out.println(myLinkedList.indexOf("35"));

        myLinkedList.clear();
        myLinkedList.printAll();

        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.printAll();
        myArrayList.add("0");
        myArrayList.add("1");
        myArrayList.add("null");
        myArrayList.add(2,"2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("10");
        myArrayList.add("17");

        myArrayList.printAll();
        myArrayList.remove(3);
        myArrayList.printAll();
        myArrayList.remove("3");
        myArrayList.printAll();
        System.out.println(myArrayList.contains("10"));
        System.out.println(myArrayList.contains("3"));

        myArrayList.clear();
        myArrayList.printAll();
    }
}
