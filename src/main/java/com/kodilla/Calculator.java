package com.kodilla;

class Calculator {

    public void add(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public void subtract(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add(2, 2);
        calculator.subtract(10, 5);
    }
}