package homeworks.part1;

import utils.Calculator;

public class Task3 {

    public static void main(String[] args) {

        int firstNumber = 125;
        int secondNumber = 24;

        System.out.println(Calculator.sum(firstNumber, secondNumber));
        System.out.println(Calculator.subtract(firstNumber, secondNumber));
        System.out.println(Calculator.multiply(firstNumber, secondNumber));
        System.out.println(Calculator.divide(firstNumber, secondNumber));
        System.out.println(Calculator.remainder(firstNumber, secondNumber));

    }
}
