package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class LuckyNum {

    public static void main(String[] args) {
        //A four-digit number ABCD is called lucky if A + B = C + D
        Scanner can = new Scanner(System.in);
        System.out.println("Enter a 4 digit integer");
        int num = can.nextInt();
        int first = num /1000;
        int second = num /100%10;
        int third = num /10 %10;
        int fourth = num % 10;
        if (num < 1000 || num >= 10000){
            System.out.println(num + " is not a valid integer");
        }else {
            if ((first + second) == (third + fourth)){
                System.out.println(num + " is a lucky number");
            }else {
                System.out.println(num + " is not a lucky number");
            }
        }
    }
}
