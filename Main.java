package com.company.CalcStr;

import java.util.Scanner;

import static com.company.CalcStr.exception.calculated;

class Main {
    static Scanner scanner = new Scanner(System.in);
    static int number;
    static char operation;
    static String result;

    public static void main(String[] args) {
        System.out.println("Введите выражение [\"a\" + \"b\", \"a\" - \"b\", \"a\" * x, \"a\" / x] где a и b - строки а x - число  от 1 до 10 включительно  + Enter ");

        String userInput = scanner.nextLine();
        char[] x = new char[30];
        for (int i = 0; i < userInput.length(); i++) {
            x[i] = userInput.charAt(i);
            if (x[i] == '+') {
                operation = '+';
            }
            if (x[i] == '-') {
                operation = '-';
            }
            if (x[i] == '*') {
                operation = '*';
            }
            if (x[i] == '/') {
                operation = '/';
            }
        } calculated();

        String[] blocks = userInput.split("[+-/*\"]");

        if (blocks.length == 5) {
            String st00 = blocks[0];
            String st01 = blocks[1];
            String st02 = blocks[2];
            String st03 = blocks[3];
            String st04 = blocks[4];
            System.out.println("-" + st00 + "-");
            System.out.println("-" + st01 + "-");
            System.out.println("-" + st02 + "-");
            System.out.println("-" + st03 + "-");
            System.out.println("-" + st04 + "-");
            result = calculated(st01, st04, operation);
            System.out.println(result);
        } else {
            String st01 = blocks[1];
            String st03 = blocks[3];
            System.out.println("-" + st01 + "-");
            System.out.println("-" + st03 + "-");
            number = Integer.parseInt(st03);
            result = calculated(st01, number, operation);
            System.out.println(result);
        }
    }
}
