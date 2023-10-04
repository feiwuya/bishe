package com.feiwuya.yunkao_android.util;

import android.widget.TextView;

import com.feiwuya.yunkao_android.pojo.QuickCalSettings;

import java.util.Random;

/**
 * 题目生成类
 */
public class CalculateUtils {
    private static Random random = new Random();

    public static String type1() {
        int operators = (int) (Math.random() * 2); // 运算符 1 加法，2减法
        int num1 = (int) (Math.random() * 100) + 10;
        int num2 = (int) (Math.random() * num1) + 10;
        return num1 + (operators == 1 ? " + " : " - ") + num2;
    }

    public static String type2() {
        int subtraction = random.nextInt(9) * 100 + 100; // 随机生成100, 200, ..., 900
        int minuend = random.nextInt(99); // 随机生成0到98之间的整数
        return subtraction + " - " + minuend;
    }

    public static String type3() {
        int num1 = random.nextInt(900) + 100; // 随机生成100到999之间的整数
        int num2 = random.nextInt(900) + 100; // 随机生成100到999之间的整数
        return num1 + " + " + num2;
    }

    public static String type4() {
        // 生成两个三位随机数
        int num1 = random.nextInt(900) + 100; // 随机生成100到999之间的整数
        int num2 = random.nextInt(num1 - 100) + 100; // 随机生成100到(num1-1)之间的整数
        return num1 + " - " + num2;
    }

    public static String type5() {
        // 生成一个随机的操作符（0代表减法，1代表加法）
        int operator = random.nextInt(2);

        // 生成两个三位随机数
        int num1 = random.nextInt(900) + 100; // 随机生成100到999之间的整数
        int num2;

        if (operator == 0) {
            // 如果是减法，保证减数比被减数大
            num2 = random.nextInt(num1 - 100) + 100; // 随机生成100到(num1-1)之间的整数
        } else {
            // 如果是加法，直接生成一个三位随机数
            num2 = random.nextInt(900) + 100; // 随机生成100到999之间的整数
        }
        String operatorSymbol;
        if (operator == 0) {
            operatorSymbol = " - ";
        } else {
            operatorSymbol = " + ";
        }
        // 输出算式
        return num1 + operatorSymbol + num2;
    }

    public static String type6() {
        // 生成四个随机两位数
        int num1 = random.nextInt(90) + 10; // 随机生成10到99之间的整数
        int num2 = random.nextInt(90) + 10;
        int num3 = random.nextInt(90) + 10;
        int num4 = random.nextInt(90) + 10;
        return num1 + " + " + num2 + " + " + num3 + " + " + num4;
    }

    public static String type7() {
        // 生成一个两位数
        int num1 = random.nextInt(90) + 10; // 随机生成10到99之间的整数

        // 生成一个一位数（不能是0和1）
        int num2 = random.nextInt(8) + 2; // 随机生成2到9之间的整数
        return num1 + " * " + num2;
    }

    public static String type8() {
        // 生成一个三位数
        int num1 = random.nextInt(900) + 100; // 随机生成100到999之间的整数
        // 生成一个一位数（不能是0和1）
        int num2;
        num2 = random.nextInt(8) + 2; // 随机生成2到9之间的整数
        return num1 + " * " + num2;
    }

    public static String type9() {
        // 生成一个随机的两位数
        int num = random.nextInt(90) + 10; // 随机生成10到99之间的整数
        return num + " * 11";
    }

    public static String type10() {
        // 生成一个随机的两位数
        int num = random.nextInt(90) + 10; // 随机生成10到99之间的整数
        return num + " * 15";
    }

    public static String type11() {
        // 生成两个随机的两位数
        int num1 = random.nextInt(90) + 10; // 随机生成10到99之间的整数
        int num2 = random.nextInt(90) + 10; // 随机生成10到99之间的整数
        return num1 + " * " + num2;
    }

    public static String type12() {
        int num = random.nextInt(21) + 10; // 随机生成10到30之间的整数
        return num + " * " + num;
    }

    public static String type13() {
        // 生成一个随机的三位数
        int dividend = random.nextInt(900) + 100; // 随机生成100到999之间的整数
        // 生成一个一位数（不能是0和1）
        int divisor;
        divisor = random.nextInt(8) + 2; // 随机生成2到9之间的整数
        return dividend + " / " + divisor;
    }

    public static String type14() {
        // 生成一个随机的三位数
        int dividend = random.nextInt(900) + 100; // 随机生成100到999之间的整数
        // 生成一个随机的两位数
        int divisor = random.nextInt(90) + 10; // 随机生成10到99之间的整数
        return dividend + " / " + divisor;
    }

    public static String type15() {
        int num1 = random.nextInt(90) + 10; // 随机生成10到99之间的整数
        int num2 = random.nextInt(90) + 10; // 随机生成10到99之间的整数
        return num1 + " * " + num2;
    }

    public static String type16() {
        int dividend = random.nextInt(90000) + 10000; // 随机生成10000到99999之间的整数
        int divisor = random.nextInt(900) + 100; // 随机生成100到999之间的整数
        return dividend + " / " + divisor;
    }

    public static double calculate(String expression) {
        String[] tokens = expression.split(" ");

        double result = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double operand = Double.parseDouble(tokens[i + 1]);

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                default:
                    System.out.println("不支持的操作符: " + operator);
            }
        }

        return result;
    }
}
