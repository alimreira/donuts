package com.doughShop.doughnuts.algos.neso10To20;

public class Ex9 {

    public static void main(String[] args) {
        //Write a program that displays the reverse of a String
        String name = "FLEXISAF";
        System.out.println(name.length());
        int i = name.length()-1;
        String reverse = "";
        while (i >= 0){
           reverse += name.charAt(i);
           --i;
        }
        System.out.println(reverse);
        System.out.println(reverse.length());
    }
}
