package com.doughShop.doughnuts.algos.neso10To20;

import java.awt.*;

public class MethodByRef {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x =10;
        p1.y = 12;

        System.out.println(p1);
        px (p1);
        System.out.println(p1);

        String city = "Abuja";
        st(city);
        System.out.println(city);

        String person = "Male";
        int age = 45;
        person(age,person);



    }
    public static void px (Point b){
        b.x = 20;
        b.y = 24;
        System.out.println(b);
    }

    public static void st (String x){
        x = "Kano";
        System.out.println(x);
    }

    //A method that gets the name of a user and a method that gets the age of a use
     public static void person (int age, String name) {
         System.out.println("Person's name is " + name + " " + " and person's age is " + age);
     }
}
