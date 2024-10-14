package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        //write a program that reads a positive integer N from the user, and indicates if N is a prime
        //number or not
        Scanner can = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = can.nextInt();
        int i = 2;
        int sum =0;
        while (i <= num/2){
            if(num % i == 0){
                sum += i;
                ++i;
                continue;
            }
            ++i;
        }
        String result = sum > 1 ? num + " is not a prime number" : num + " is a prime number";
        System.out.println(result);



    }
}
