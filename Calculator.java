package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическую операцию арабскими или римскими цифрами (например: 1 + 1) : \n");
        String number = scanner.nextLine();


        String[] split = number.split(" ");
        Arrays.toString(split);


        String x = split[0];
        String y = split[2];
        String operator = split[1];
        if (x.matches("\\d+") && y.matches("\\d+")) {
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);

            operator = operator.trim();
            int result;
            switch (operator) {

                case "+":
                    result = Calc.addNums(a, b);
                    System.out.println(x + " " + operator + " " + y + " " + "=" + " " + result);

                    break;
                case "-":
                    result = Calc.substNums(a, b);
                    System.out.println(x + " " + operator + " " + y + " " + "=" + " " + result);
                    break;
                case "*":
                    result = Calc.multNums(a, b);
                    System.out.println(x + " " + operator + " " + y + " " + "=" + " " + result);
                    break;
                case "/":
                    result = Calc.divNums(a, b);
                    System.out.println(x + " " + operator + " " + y + " " + "=" + " " + result);
            }


        }else if (x.matches("\\D+")&&y.matches("\\D+")){
            int a = RomanToDecimal.romanToDecimal(x);
            int b = RomanToDecimal.romanToDecimal(y);

            int result;

            switch (operator) {

                case "+":
                    result = Calc.addNums(a, b);
                    String newResult = DecimalToRoman.decimalToRoman(result);
                    System.out.println(x + " " + operator + " " + y + " " + "=" + " " + newResult);

                    break;
                case "-":
                    result = Calc.substNums(a, b);
                    newResult = DecimalToRoman.decimalToRoman(result);
                    System.out.println(x + " " + operator + " " + y + " " + "=" + " " + newResult);
                    break;
                case "*":
                    result = Calc.multNums(a, b);
                    newResult = DecimalToRoman.decimalToRoman(result);
                    System.out.println(x + " " + operator + " " + y + " " + "=" + " " + newResult);
                    break;
                case "/":
                    result = Calc.divNums(a, b);
                    newResult = DecimalToRoman.decimalToRoman(result);
                    System.out.println(x + " " + operator + " " + y + " " + "=" + " " + newResult);
            }

        }else{
            throw new Exception("Оба числа должны совпадать по формату, введите только римские или только арабские цифры");
        }
    }
}
