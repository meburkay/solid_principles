package com.cydeo.solid.openClosed.example2.good;

public class Calculator {
    //By this way we do not need to touch this class. When we want to add any other operation we create its class and here it automatically calculate it .

    public void calculate(Operation operation) {

        int num1 = 10;
        int num2 = 2;

        operation.calculate(num1, num2);

    }

}
