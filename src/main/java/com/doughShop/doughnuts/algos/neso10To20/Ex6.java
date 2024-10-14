package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        //Write a program that displays the sum of digits of an integer read from the user
        //Focus is on reducing the number entered by the user until it becomes 0,
        // as well as adding the eliminated number to sum variable
//        Scanner can = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = can.nextInt();
//        int sum = 0;
//
//        while (num > 0){
//             sum += num % 10; //Extract a digit
//             num /= 10; //remove a digit
//        }
//        System.out.println(sum + " is the sum of 1994");

        Scanner can = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = can.nextInt();
        int sum =0;
        //num >= 0 will be wrong because :
        /**
         * if you entered 123, here’s what happens:
         *
         * num starts at 123, sum is 0.
         * Iteration 1: num % 10 is 3, sum becomes 3, then num becomes 12.
         * Iteration 2: num % 10 is 2, sum becomes 5, then num becomes 1.
         * Iteration 3: num % 10 is 1, sum becomes 6, then num becomes 0.
         * Exit Condition: Since num is now 0, it exits the loop.
         * If you used num >= 0, the loop would run again:
         *
         * Iteration 4: num is 0, sum stays 6, then num remains 0.
         * Loop continues infinitely since num remains 0.
         * So, using num > 0 avoids unnecessary extra iterations and ensures you only process the digits that contribute to the sum.*/
        while (num > 0) {
            sum += num%10; //extacting and collating the digits
            num /= 10; //reducing the number to zero
        }
        System.out.println(sum);
        System.out.println(num);



    }
}
