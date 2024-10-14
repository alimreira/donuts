package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class Iteration {

    public static void main(String[] args) {
        //Types of loops:
        /**
         While loop
         Do while loop
         For loop

         A loop is use to execute a statement more than once
         The statement will keep executing as long as the boolean
         expression or condition evaluates to true.
         Each execution is called an iteration
         Increment or decrement operator is use to change the boolean expression
         When the boolean expression is false, the body of the loop (while, do or for loop)
         will be skipped.
         An infinite loop is a loop that does not end.
         Causes of infinite loop:
         1. Not including the increment or decrement
         2. When the boolean expression is "true", without a break keyword
         When the body of a while loop finish executing, the loop goes to the condtion
         in other to begin next iteration
         When the body of a for-loop finish execution, the loop goes to the change in other to
         begin next iteration
         The boolean expression, detemines the number of iteration
         */

        //Write a program that reads an integer between 1 and 10 from the user
        Scanner can = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 10");
        int num = can.nextInt();
//        if (num == 1) {
//            System.out.println(num);
//        } else if (num == 2) {
//            System.out.println(num);
//        } else if (num == 3) {
//            System.out.println(num);
//        } else if (num == 4) {
//            System.out.println(num);
//        } else if (num == 5) {
//            System.out.println(num);
//        } else if (num == 6) {
//            System.out.println(num);
//        } else if (num == 7) {
//            System.out.println(num);
//        } else if (num == 8) {
//            System.out.println(num);
//        } else if (num == 9) {
//            System.out.println(num);
//        } else if (num == 10) {
//            System.out.println(num);
//        } else {
//            System.out.println(num + " is not a number between 1 and 10");
//        }


//        while (true){
//            if(num < 1 || num > 10){
//                System.out.println(num + " is not a number between 1 and 10");
//                System.out.println("Try another integer");
//                num = can.nextInt();
//            }else {
//                System.out.println(num + " is a number between 1 and 10");
//                break;
//            }
//        }

        //do- while loop
        do{
            if(num < 1 || num > 10){
                System.out.println(num + " is not a number between 1 and 10");
                System.out.println("Try another integer");
                num = can.nextInt();
            }else {
                System.out.println(num + " is a number between 1 and 10");
                break;
            }
        }while (true);
    }
}
