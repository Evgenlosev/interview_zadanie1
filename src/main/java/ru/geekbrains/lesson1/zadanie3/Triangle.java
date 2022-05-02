package ru.geekbrains.zadanie3;

public class Triangle extends Shape {
    private double length1;
    private double length2;
    private double length3;

    @Override
    public double getArea() {
        double polPer = (length1 + length2 + length3) / 2;
        return Math.sqrt(polPer * (polPer - length1) * (polPer - length2) * (polPer - length3));
    }

    @Override
    public double getPerimeter() {
        return length1 + length2 + length3;
    }

    public double getLength1() {
        return length1;
    }

    public void setLength1(double length1) {
        this.length1 = length1;
    }

    public double getLength2() {
        return length2;
    }

    public void setLength2(double length2) {
        this.length2 = length2;
    }

    public double getLength3() {
        return length3;
    }

    public void setLength3(double length3) {
        this.length3 = length3;
    }

    public Triangle(double length1, double length2, double length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }
}
