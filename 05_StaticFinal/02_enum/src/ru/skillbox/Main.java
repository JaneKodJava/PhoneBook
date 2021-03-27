package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(3,3);
        arithmeticCalculator.calculate(Operation.ADD);

        ArithmeticCalculator arithmeticCalculator1 = new ArithmeticCalculator(10,5);
        arithmeticCalculator1.calculate(Operation.SUBTRACT);

        ArithmeticCalculator arithmeticCalculator2 = new ArithmeticCalculator(2,2);
        arithmeticCalculator2.calculate(Operation.MULTIPLY);
    }

}
