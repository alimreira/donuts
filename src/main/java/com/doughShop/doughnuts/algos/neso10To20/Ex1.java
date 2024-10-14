package com.doughShop.doughnuts.algos.neso10To20;

public class Ex1 {

    public static void main(String[] args) {
        //Write a program that prints the even numbers 100 in a decreasing order
        for (int i = 100; i >= 1; --i){
            //Executing a statement based on a condition
            if(i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
