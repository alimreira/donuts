package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        //write a program that displays a String with a space after each character
        Scanner can = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = can.nextLine();
        String st = "";
//        System.out.println(st.length());
        for (int i =0; i<=word.length()-1; ++i){
            st += word.charAt(i) + " ";
        }
        System.out.println(st);
    }
}
