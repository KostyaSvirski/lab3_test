package by.bsuir.lab3.triangle;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeOfTriangle {

    EQUILATERAL(1), ISOSCELES(2), RECTANGULAR(8), ORDYNARY(4);

    private final int value;

}
