package com.kodilla;

class Calculator {

    public void addAToB(int intA, int intB) {
        int result = intA + intB;
        System.out.println(result);
    }

    public void subtractAFromB(int intA, int intB) {
        int result = intA - intB;
        System.out.println(result);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.addAToB(2, 2);
        calculator.subtractAFromB(10, 5);
    }
}