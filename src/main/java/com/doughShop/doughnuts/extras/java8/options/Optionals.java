package com.doughShop.doughnuts.extras.java8.options;

import java.util.InputMismatchException;
import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        Optional<String> str = Optional.of("Tuesday");
       Optional<String> str1 =  Optional.ofNullable("Yesterday");
       Optional<Integer> inn = Optional.empty();

        System.out.println(str);
        System.out.println(str1);
        System.out.println(inn);

        String one = str.get();
        String one1 = str.orElse("Not present");
        Integer one2 = inn.orElse(null);
        String str10= str1.orElseGet(()-> "No value to extract");
        String test = str.orElseThrow(()-> new InputMismatchException());
        Optional<String> test1 = str1.filter((s)-> s.equals("Yesterday"));
        System.out.println(one);
        System.out.println(one1);
        System.out.println(one2);
        System.out.println(str10);
        System.out.println(test);
        System.out.println(test1);


    }
}
