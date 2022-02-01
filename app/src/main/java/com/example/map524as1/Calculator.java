package com.example.map524as1;

import java.util.ArrayList;

public class Calculator {
    ArrayList<String> arguments = new ArrayList<>();
    void push(String value){
        arguments.add(value);
    }
    public static boolean isNumeric(String string) {
        if (string == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(string);
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
        int isFirst = 0;
        String operation = "";
        int size = arguments.size();
        boolean isFirstNumber = isNumeric(arguments.get(0));
        boolean isLastNumber = isNumeric(arguments.get(size - 1));
        if(size >= 3 && isFirstNumber && isLastNumber) {
            for(int i = 0; i < size; i++) {
                if (isNumeric(arguments.get(i))) {
                    if (isFirst == 0) {
                        result = Integer.parseInt(arguments.get(i));
                    }else{
                        result = calculation(result, operation, Integer.parseInt(arguments.get(i)));
                    }
                }else{
                    operation = arguments.get(i);
                    isFirst = 1;
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
