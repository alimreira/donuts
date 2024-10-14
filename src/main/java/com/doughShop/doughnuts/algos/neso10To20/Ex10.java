package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        //Write a program that finds if a String is a palindrome String or not
        Scanner can = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = can.nextLine();
        String reverse ="";
        int i =word.length()-1;
        while (i >= 0){
            reverse += word.charAt(i);
            --i;
        }
        String st = reverse.equals(word)? word + " is a palindrome": word + " is not a palindrome";
        System.out.println(st);
    }
}
