package com.doughShop.doughnuts.algos.neso10To20;

public class MethodEx2 {

    public static void main(String[] args) {
        //write a program that prints the prime number between 2 numbers
        /**
         *1. A method to detect prime numbers
         * 2. A method to take 2 numbers to be searched/combed for prime numbers
         * */

        primeNums(15,67);
    }

    public static boolean prime (int num) {
        int i =2;
        int sum =0;
        while (i <= num/2){
            if(num%i == 0){
                sum += i;
                ++i;
            }
            ++i;
        }
        boolean result =  sum > 1 ? false : true;
        return result;
    }

    public static void primeNums (int start, int end){
        for (int i =start; i <= end; ++i){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }

}
