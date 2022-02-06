package by.bsuir.lab3.triangle;

import lombok.Getter;

@Getter
public class Triangle {

    private double a;
    private double b;
    private double c;
    private String message;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.message = "";
    }

    public boolean checkTriangle() {
        if (this.a <= 0.0D) {
            this.message = "a<=0";
            return false;
        } else if (this.b <= 0.0D) {
            this.message = "b<=0";
            return false;
        } else if (this.c <= 0.0D) {
            this.message = "c<=0";
            return false;
        } else if (this.a + this.b <= this.c) {
            this.message = "a+b<=c";
            return false;
        } else if (this.a + this.c <= this.b) {
            this.message = "a+c<=b";
            return false;
        } else if (this.b + this.c <= this.a) {
            this.message = "b+c<=a";
            return false;
        } else {
            return true;
        }
    }

    public int detectTriangle() {
        if (this.a * this.a + this.b * this.b == this.c * this.c || this.b * this.b + this.c * this.c == this.a * this.a || this.a * this.a + this.c * this.c == this.b * this.c) {
            return TypeOfTriangle.RECTANGULAR.getValue();
        }

        if (this.a == this.b && this.b == this.c && this.a == this.c) {
            return TypeOfTriangle.EQUILATERAL.getValue();
        }

        if (this.a == this.b || this.b == this.c || this.a == this.c) {
            return TypeOfTriangle.ISOSCELES.getValue();
        }

        return TypeOfTriangle.ORDYNARY.getValue();
    }

    public double getSquare() {
        double p = (this.a + this.b + this.c) / 2.0D;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }
}
