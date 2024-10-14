package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class Nested {


    public static void main(String[] args) {
        //Implement this logic:
        /*
        * if n > 10, sout > 10
        else if n= 10,sout = 10
        * else sout < 10
         */

        Scanner n = new Scanner(System.in);
        System.out.println("Assign a value to num");
        int num = n.nextInt();
        if (num > 10){
            System.out.println(num + " is greater than 10");
        }else
            if (num == 10){
                System.out.println(num + " is equals to 10");
        }else {
            System.out.println(num + " is less than 10");
        }
    }

    //switch statement


}
