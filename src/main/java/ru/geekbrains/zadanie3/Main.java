package ru.geekbrains.zadanie3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Сircle(3), new Triangle(3, 4, 5), new Square(2));
        for (Shape shape : shapes) {
            System.out.println("Периметр равен " + shape.getPerimeter() + ". " +
                    "Площадь равна " + shape.getArea());
        }
    }
}
