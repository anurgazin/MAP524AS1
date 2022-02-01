package com.example.map524as1;

import java.util.ArrayList;

public class Calculator {
    ArrayList<String> arguments = new ArrayList<>();
    void push(String value){
        arguments.add(value);
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    int calculation(int num1, String operation,int num2){
        switch (operation){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return  num1 * num2;
            case "/":
                return  num1 / num2;
            case "%":
                return  num1 % num2;
            case "pow":
                return (int) Math.pow(num1, num2);
            case "min":
                return Math.min(num1, num2);
            case "max":
                return Math.max(num1, num2);
        }
        return 0;
    }
    int calculate() throws Exception {
        int result = 0;
        int flag = 0;
        String operation = "";
        int size = arguments.size();
        boolean isFirstNumber = isNumeric(arguments.get(0));
        boolean isLastNumber = isNumeric(arguments.get(size - 1));
        if(size >= 3 && isFirstNumber && isLastNumber) {
            for(String argument : arguments) {
                if (isNumeric(argument)) {
                    if (flag == 0) {
                        result = Integer.parseInt(argument);
                    }else{
                        result = calculation(result, operation, Integer.parseInt(argument));
                    }
                }else{
                    operation = argument;
                    flag = 1;
                }
            }
        }else{
            arguments.clear();
            throw new Exception("Invalid Input");
        }
        arguments.clear();
        return result;
    }
}
