package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class Calculate {


    public static void main(String[] args) {
        //Develop a calculator that performs addition, subtraction, division, multiplication and modulus operations.
        Scanner can = new Scanner(System.in);
        System.out.println("Perform an arithmetic operation");
        int op1 = can.nextInt();
        char op = can.next().charAt(0);
        int op2 = can.nextInt();
        if(op == '+'){
            System.out.println(op1 + op2);
        }else
            if(op == '-'){
             System.out.println(op1 - op2);
        }else
            if(op == '*'){
                System.out.println(op1 * op2);
            }else
                if(op == '/'){
                    System.out.println(op1 / op2);
                }else
                    if(op == '%'){
                        System.out.println(op1 % op2);
                    }

    }
}
