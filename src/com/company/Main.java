package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа:");
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        double num1 = scan.nextDouble();
        System.out.print("b = ");
        double num2 = scan.nextDouble();
        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("0. exit");
            System.out.println("1. a + b");
            System.out.println("2. a - b");
            System.out.println("3. a / b");
            System.out.println("4. a * b");
            int choise = scan.nextInt();
            if (choise == 0) {
                break;
            } else if (choise == 1) {
                System.out.println(addition(num1, num2));
            } else if (choise == 2) {
                System.out.println(subtraction(num1, num2));
            } else if (choise == 3) {
                System.out.println(division(num1, num2));
            } else if (choise == 4) {
                System.out.println(multiplication(num1, num2));
            }

        }

    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }
}

