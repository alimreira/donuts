package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        //write a program that displays the sum of the strict divisor of an integer given by the user
        //Any number between 1 and n/2 is n's strict divisor
        Scanner can = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = can.nextInt();
        int sum =0;
        for ( int i =1; i<= num/2; ++i){
            if(num%i == 0){
                System.out.println(i + " is a strict divisor of " + num);
                sum += i;
            }
        }
        System.out.println(sum + " is the sum of the  strict divisor of " + num);
    }
}
