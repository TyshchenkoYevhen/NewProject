package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int result1 = sumNumbers1();
        int result = sumNumbers(10, 20);
        int resultMul = mulNumbers(5, 5);
        double resultDiv = divNumbers(5, 2);
        int resultSub = subNumbers(40, 25);
        double resultDis = discountNumbers(75);
        System.out.println("Результат сложение без входящих параметров" + " " + result1);
        System.out.println("Результат сложение" + " " + result);
        System.out.println("Результат умножение" + " " + resultMul);
        System.out.println("Результат деления" + " " + resultDiv);
        System.out.println("Результат вычитание" + " " + resultSub);
        System.out.println("Скидка 5% процентов" + " " + resultDis);
    }

    public static int sumNumbers1() {
        int a = 1;
        int b = 2;
        int c = a + b;
        return c;
    }

    public static int sumNumbers(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int mulNumbers(int a, int b) {
        int c = a * b;
        return c;
    }

    public static double divNumbers(double a, double b) {
        double c = a / b;
        return c;
    }

    public static int subNumbers(int a, int b) {
        int c = a - b;
        return c;
    }

    public static double discountNumbers(double a) {
        double i = (a * 5) / 100;
        double c = (a - i);
        return c;
    }
}
