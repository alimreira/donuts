package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //The fibonacci sequence is a sequence of number in which the first 2 numbers are
        //1 and 1. Each additional fibonacci number is the sum of 2 previous numbers in the
        //sequence.
        //Write a program that reads an integer n from the user, and reads its nth fibonacci number
        Scanner can = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = can.nextInt();

        int first =1;
        int second =1;
        int next = 0;
        //1,1,2,3,5,8,13,21,34,55,
        int i= 1;
        while (i <= (num-2)){
            next = first + second;
            first = second;
            second =next;
            ++i;
        }
//        System.out.println(next);
        int nt = num == 1? 1 :next;
        System.out.println(nt);

    }
}
