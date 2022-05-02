package ru.geekbrains.zadanie3;

public class Square extends Shape {
    private double length;

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Square(double length) {
        this.length = length;
    }
}
