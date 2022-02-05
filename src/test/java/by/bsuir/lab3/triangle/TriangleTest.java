package by.bsuir.lab3.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private double parameterA;
    private double parameterB;
    private double parameterC;

    @Test
    public void checkTriangle_Correct_tst() {
        this.parameterA = 15.0D;
        this.parameterB = 12.0D;
        this.parameterC = 14.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertTrue(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Zero_A_tst() {
        this.parameterA = 0.0D;
        this.parameterB = 12.0D;
        this.parameterC = 14.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Zero_B_tst() {
        this.parameterA = 15.0D;
        this.parameterB = 0.0D;
        this.parameterC = 14.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Zero_C_tst() {
        this.parameterA = 15.0D;
        this.parameterB = 12.0D;
        this.parameterC = 0.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Negative_A_tst() {
        this.parameterA = -15.0D;
        this.parameterB = 12.0D;
        this.parameterC = 14.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Negative_B_tst() {
        this.parameterA = 15.0D;
        this.parameterB = -12.0D;
        this.parameterC = 14.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Negative_C_tst() {
        this.parameterA = 15.0D;
        this.parameterB = 12.0D;
        this.parameterC = -14.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Three_More_C_tst() {
        this.parameterA = 15.0D;
        this.parameterB = 12.0D;
        this.parameterC = 14.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertTrue(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Three_More_B_tst() {
        this.parameterA = 15.0D;
        this.parameterB = 12.0D;
        this.parameterC = 14.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertTrue(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Three_More_A_tst() {
        this.parameterA = 15.0D;
        this.parameterB = 12.0D;
        this.parameterC = 14.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertTrue(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Three_Less_C_tst() {
        this.parameterA = 1.0D;
        this.parameterB = 2.0D;
        this.parameterC = 14.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Three_Less_B_tst() {
        this.parameterA = 5.0D;
        this.parameterB = 12.0D;
        this.parameterC = 1.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Three_Less_A_tst() {
        this.parameterA = 15.0D;
        this.parameterB = 1.0D;
        this.parameterC = 1.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Three_Equal_C_tst() {
        this.parameterA = 5.0D;
        this.parameterB = 5.0D;
        this.parameterC = 10.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Three_Equal_B_tst() {
        this.parameterA = 5.0D;
        this.parameterB = 10.0D;
        this.parameterC = 5.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void checkTriangle_Three_Equal_A_tst() {
        this.parameterA = 10.0D;
        this.parameterB = 5.0D;
        this.parameterC = 5.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertFalse(triangle.checkTriangle());
    }

    @Test
    public void detectTriangle_Restangular_1_tst() {
        this.parameterA = 3.0D;
        this.parameterB = 4.0D;
        this.parameterC = 5.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertEquals(triangle.detectTriangle(), 8L);
    }

    @Test
    public void detectTriangle_Restangular_2_tst() {
        this.parameterA = 5.0D;
        this.parameterB = 4.0D;
        this.parameterC = 3.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertEquals(triangle.detectTriangle(), 8L);
    }

    @Test
    public void detectTriangle_Restangular_3_tst() {
        this.parameterA = 2.0D;
        this.parameterB = 5.0D;
        this.parameterC = 4.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertEquals(triangle.detectTriangle(), 8L);
    }

    @Test
    public void detectTriangle_Equilateral_tst() {
        this.parameterA = 2.0D;
        this.parameterB = 2.0D;
        this.parameterC = 2.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertEquals(triangle.detectTriangle(), 0L);
    }

    @Test
    public void detectTriangle_Isosceles_1_tst() {
        this.parameterA = 2.0D;
        this.parameterB = 2.0D;
        this.parameterC = 3.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertEquals(triangle.detectTriangle(), 2L);
    }

    @Test
    public void detectTriangle_Isosceles_2_tst() {
        this.parameterA = 3.0D;
        this.parameterB = 2.0D;
        this.parameterC = 2.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertEquals(triangle.detectTriangle(), 2L);
    }

    @Test
    public void detectTriangle_Isosceles_3_tst() {
        this.parameterA = 2.0D;
        this.parameterB = 3.0D;
        this.parameterC = 2.0D;
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertEquals(triangle.detectTriangle(), 2L);
    }

    @Test
    public void detectTriangle_Isosceles_Restangular_tst() {
        this.parameterA = 2.0D;
        this.parameterB = 2.0D;
        this.parameterC = 2.0D * Math.sqrt(2.0D);
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertEquals(triangle.detectTriangle(), 0L);
    }

    @Test
    public void detectTriangle_Ordinary_tst() {
        this.parameterA = 1.0D;
        this.parameterB = 3.0D;
        this.parameterC = 8.0D * Math.sqrt(2.0D);
        Triangle triangle = new Triangle(this.parameterA, this.parameterB, this.parameterC);
        assertEquals(triangle.detectTriangle(), 4L);
    }

}