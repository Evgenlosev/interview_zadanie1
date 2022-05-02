package ru.geekbrains.lesson2;


import java.util.Arrays;

public class MyArrayList<E> {

    private Object[] array;
    private int capacity;
    private int size;

    public MyArrayList() {
        capacity = 16;
        array = new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }


    public void add(E element) {
        if (size == capacity) {
            capacity *= 2;
//            Object[] arrayCopy = new Object[capacity];
            array = Arrays.copyOf(array, capacity);
        }
        array[size] = element;
        size++;
    }

    public void add(int index, E element) {
        if (size == capacity) {
            capacity *= 2;
            array = Arrays.copyOf(array, capacity);
        }
        array[index] = element;
    }


    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return remove(i);
            }
        }
        return false;
    }

    public boolean remove(int index) {
        if (size == 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        array[size] = null;
        return true;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        array = new Object[capacity];
        size = 0;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }


    public void printAll() {
        if (size > 0) {
            System.out.print("[" + array[0]);
            for (int i = 1; i < size; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.print("]");
            System.out.println();
            return;
        }
        System.out.println("[]");
    }


}
