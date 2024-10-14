package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        //write a program that reads a sequence of positive integers, and stops when the
        //user fills a negative value and shows the maximum and the minimum of these values.

        Scanner can = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = can.nextInt();
        int max = num;
        int min = num;
        while (num >= 0 ){
                max = max > num ? max :num;
                min = min < num ? min :num;
            System.out.println("Enter another integer");
            num = can.nextInt();
                continue;
            }
        System.out.println(max + " is the maximum value");
        System.out.println(min + " is the minimum value");
        }


    }

