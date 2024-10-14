package com.doughShop.doughnuts.algos.neso10To20;

import java.util.Scanner;

public class OneToTen {

    public static void main(String[] args) {
        String location = "Abuja";
        String result = location.concat(" city").toUpperCase();
        System.out.println(result);
        String print = result;

        String cup = "milk";
        cup = "coffee";

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name :");
//        String person = input.nextLine();
//        String person1 = person.concat(" Ahmed");
//        System.out.println(person);
//        System.out.println(person1);

//        Scanner can = new Scanner(System.in);
//        System.out.println("Enter your favorite number :");
//        int num = can.nextInt();
//        System.out.println("My favorite number is " + num);

        //Read the user's name and age and display them in a proper message:
//        Scanner can = new Scanner(System.in);
//        System.out.println("Introduce yourself");
//        String name = can.nextLine();
//        int age = can.nextInt();
//        System.out.println(name + " " + age);

        int i = 20;
        System.out.println(i += 4);

        //Write a program that reads an integer from the user and determines if the integer is even or odd
//        Scanner van = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int num = van.nextInt();
//        if (num % 2 ==0){
//            System.out.println(num + " is an even number");
//        }
//        System.out.println(num + " is an odd number");

        Scanner can = new Scanner(System.in);
        System.out.println("Enter an integer");
        int be = can.nextInt();
        switch (be){
            case 34:
                System.out.println(be + " is a number above 30");
                break;
            case 12:
                System.out.println(be + " is a number above 10");
                break;
            case 25:
                System.out.println(be + " is a number below 30");
                break;
            default:
                System.out.println(be + " is not in the range of integer");
        }
    }

}
