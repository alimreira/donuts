package com.doughShop.doughnuts.extras.java8;

import com.doughShop.doughnuts.oop.Employee;

import java.util.function.*;

public class ImplWithLambda {

    public static void main(String[] args) {
        FunctionalInf1 one = ((x,y)-> System.out.println(x * y));
        one.calCost(12,340);

        FunctionalInf2 two = ((x)->x.toUpperCase());
        System.out.println(two.location("Michighan"));

        //Method reference
        Function<Integer,Double> fl = ((x)-> Math.sqrt(x));
        Double dl = fl.apply(64);
        System.out.println(dl);

        Function<Integer,Double> fl1 = (Math::sqrt);
        Double dl1 = fl.apply(49);
        System.out.println(dl1);

        BiFunction<Float,Float,Integer> biFunction = ((x,y)-> x.compareTo(y));
        Integer inn = biFunction.apply(8.9f,12.6f);
        System.out.println(inn);

        BiFunction<Float,Float,Integer> biFunction1 = (Float::compareTo);
        Integer inn1 = biFunction.apply(45.7f,12.6f);
        System.out.println(inn1);

        Predicate<String> str = ((x)-> x.contains("r"));
        boolean ln = str.test("Happiness");
        System.out.println(ln);

        BiFunction<Float,Float,Integer> fl3 = ((x,y)-> {
            Employee employee = new Employee();
            return (Integer) (employee.costOfTransport(x,y));
        });
        System.out.println(fl3.apply(45f,450f));




    }
}
