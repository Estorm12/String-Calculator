package com.company.CalcStr;

import org.jetbrains.annotations.NotNull;
import java.util.InputMismatchException;

class exception {

    public static @NotNull
    String calculated(String num1, int num, char op) {

        StringBuilder result = null;
        switch (op) {
            case '+':
                System.out.println("Неверный знак операции + (введите * или /)");

                break;
            case '-':
                System.out.println("Неверный знак операции - (введите * или /)");
                break;
            case '*':
                assert false;
                result.append(String.valueOf(num1).repeat(Math.max(0, num)));
                break;
            case '/':
                try {
                    int resultB = num1.length() / num;
                    result = new StringBuilder(num1.substring(0, resultB));
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Исключение : " + e);
                    System.out.println("Только число разрешается, не ноль");
                    break;
                } finally {
                    if (num1.length() < num) {
                        System.out.println("Делимое меньше делителя");
                    }
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        assert result != null;
        return result.toString();
    }

        public static String calculated(String num1, String num2, char op) {

            String result = null;
            switch (op) {
                case '+' -> result = num1 + num2;
                case '-' -> {
                    int resultA = num1.length() - num2.length();
                    result = num1.substring(0, resultA);
                }
                case '/' -> { int resultA = num1.length() / num2.length();
                    result = num1.substring(0, resultA);}
                case '*' -> { int resultA = num1.length() * num2.length();
                    result = num1.substring(0, resultA);}
            }
            return result;
    }
    public static void calculated() { }
}