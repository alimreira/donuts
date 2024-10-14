package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class CalculateSwitch {

    public static void main(String[] args) {
        //Develop a calculator that performs addition, subtraction, division, multiplication and modulus operations.
        Scanner can = new Scanner(System.in);
        System.out.println("Perform an operation");
        int num = can.nextInt();
        char op = can.next().charAt(0);
        int num1 = can.nextInt();
        switch (op){
            case '+':
                System.out.println(num + num1);
                break;
            case '-':
                System.out.println(num - num1);
                break;
            case '/':
                System.out.println(num / num1);
                break;
            case '*':
                System.out.println(num * num1);
                break;
            case '%':
                System.out.println(num % num1);
                break;
            default:
                System.out.println(op + " is not a valid operator");
        }
    }
}
