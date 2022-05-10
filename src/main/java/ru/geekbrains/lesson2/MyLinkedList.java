package ru.geekbrains.lesson2;


public class MyLinkedList<E> {
    private Node<E> first = new Node<>();
    private Node<E> last = new Node<>();

    private int size = 0;

    public MyLinkedList() {
        first.next = last;
        last.previous = first;
    }

    public E getFirst() {
        return first.value;
    }

    public E getLast() {
        return last.value;
    }

    public int size() {
        return size;
    }

    public void add(E element) {
        if (size == 0) {
            first.value = element;
            size++;
            return;
        }
        if (size == 1) {
            last.value = element;
            size++;
            return;
        }
        Node<E> node = new Node<>(element);
        last.next = node;
        node.previous = last;
        last = node;
        size++;
    }

    public void add(int index, E element) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> node = new Node<>(element);
        if (size == 0) {
            first = node;
        } else if (size == 1) {
            node.previous = first;
            first.next = node;
            last = node;
        } else {
            last.next = node;
            node.previous = last;
            last = node;
        }
        size++;
        return;
    }

    public boolean remove(E element) {
        if (size == 0) {
            return false;
        }
        Node currentNode = first;
        while (currentNode != null) {
            if (currentNode.value.equals(element)) {
                size--;
                if (currentNode.previous == null) {
                    currentNode.next.previous = null;
                    first = currentNode.next;
                    return true;
                }
                if (currentNode.next == null) {
                    currentNode.previous.next = null;
                    last = currentNode.previous;
                    return true;
                }
                currentNode.previous.next = currentNode.next;
                currentNode.next.previous = currentNode.previous;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean remove(int index) {
        if (size == 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        size--;
        if (index == 0) {
            first.next.previous = null;
            first = first.next;
            return true;
        }

        if (index == size) {
            last.previous.next = null;
            last = last.previous;
            return true;
        }
        Node currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.previous.next = currentNode.next;
        currentNode.next.previous = currentNode.previous;
        return true;
    }

    public boolean contains(E element) {
        Node currentNode = first;
        while (currentNode != null) {
            if (currentNode.value.equals(element)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void clear() {
        first = new Node<>();
        last = new Node<>();
        size = 0;
    }

    public int indexOf(E element) {
        Node currentNode = first;
        for (int i = 0; i < size; i++) {
            if (currentNode.value.equals(element)) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }


    public void printAll() {
        if (size == 0) {
            System.out.println("null");
            return;
        }
        Node currentNode = first;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    private class Node<E> {
        Node<E> previous;
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
        }

        public Node() {
        }
    }

}
