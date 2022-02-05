package by.bsuir.lab3;

import by.bsuir.lab3.triangle.Triangle;

public class Main {

    public static void main(String[] args) {
        Triangle tr = new Triangle(1.0D, 2.0D, 2.0D);
        System.out.println(tr.checkTriangle());
        System.out.println(tr.getMessage());
        System.out.println(tr.detectTriangle());
    }
}
