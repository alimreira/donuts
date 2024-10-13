package com.doughShop.doughnuts.extras.java8.java8Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pupil implements Comparable<Pupil>{
    private String name;
    private int age;
    private String level;
    private float tution;

    public Pupil(String name, int age, String level, float tution) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.tution = tution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public float getTution() {
        return tution;
    }

    public void setTution(float tution) {
        this.tution = tution;
    }

    public static void main(String[] args) {
        List<Pupil> list = new ArrayList<>();
        Pupil pupil = new Pupil("One",7,"level4",6789f);
        Pupil pupil1 = new Pupil("Two",4,"level2",456f);
        Pupil pupil2 = new Pupil("Three",5,"level3",500f);
        Pupil pupil3 = new Pupil("Four",9,"level6",7500f);
        list.add(pupil);
        list.add(pupil1);
        list.add(pupil2);
        list.add(pupil3);
        Collections.sort(list);
        list.forEach((c)-> System.out.println(c));

//        Collections.sort(list,((o1,o2)-> (int) (o2.tution -o1.tution)));
//        System.out.println(list);

        Collections.sort(list,((o1,o2)-> o1.compareTo(o2)));
        System.out.println(list);
    }

//    @Override
//    public int compareTo(Pupil o) {
//        return Integer.compare(o.age,this.age);
//    }

//    @Override
//    public int compareTo (Pupil x){
//        return Float.compare(this.tution, x.tution);
//    }

    @Override
    public int compareTo (Pupil x){
        return this.name.compareTo(x.name);
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level='" + level + '\'' +
                ", tution=" + tution +
                '}';
    }
}
