package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        //write a program that reads a sequence of integers from a user and stops by displaying DONE when the sum of
        //these integers exceed 100
        Scanner can = new Scanner(System.in);
        System.out.println("Enter an integer");
        int sum =0;
        int num = can.nextInt();
        sum  += num;
        while (true){
            if(sum >= 100){
                System.out.println(sum + " DONE!!");
                break;
            }
            System.out.println(sum + " Enter another integer");
                num = can.nextInt();
                sum += num;
        }

    }
}
