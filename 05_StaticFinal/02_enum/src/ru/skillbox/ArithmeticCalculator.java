package ru.skillbox;

public class ArithmeticCalculator {

    public int firstNumber;
    public int secondNumber;
    private int sum;
    private int diff;
    private int prod;

    public ArithmeticCalculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void calculate(Operation type){
        if(type == Operation.ADD )
        {
            sum = firstNumber + secondNumber;
            System.out.println("Сумма чисел: "+ sum);
        }
        if (type == Operation.SUBTRACT){
            diff = firstNumber - secondNumber;
            System.out.println("Разность чисел: " + diff);
        }
        if (type == Operation.MULTIPLY){
            prod = firstNumber * secondNumber;
            System.out.println("Произведение чисел: " +prod);
        }
    }
}
