package com.doughShop.doughnuts.oop;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private  int age;
    private String occupation;
    private String residence;

    public static void main(String[] args) {
        Person person = new Person("Rameesh","Fadtre",34,"chef","Vegas");
        Person person1 = new Person("Chan","Su",22,"teacher","Chigago");
        Person person2 = new Person("Sandra","Gomez",32,"waitress","Hollywood");
        Person person3 = new Person("Victory","Tijani",30,"sport coordinator","Minnesona");
        Person person4 = new Person("Unity","Smith",21,"student","Indiana");

        Person person5 = new Person();
        for(int i = 0; i<= person5.people().size()-1; i++){
            System.out.println(person5.people().get(i));
        }
        System.out.println();
        System.out.println();
        for(Person p : person5.people()){
            if(p.age > 20){
                System.out.println(p);
            }
        }
        System.out.println();
        System.out.println();
        //filtering with stream
        person5.people().stream().forEach((c)-> System.out.println(c));

        System.out.println();
        System.out.println();
        person5.people().stream().forEach((c)->{
          if(c.age <= 20)
            System.out.println(c);
        });

    }

    public Person() {
    }

    public Person(String firstName, String lastName, int age, String occupation, String residence) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
        this.residence = residence;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void costOfTransport (int milesFromHome, float costPerMile){
        float fareTOAndFro = milesFromHome * 2;
        float fare = (float) (fareTOAndFro * costPerMile);
        System.out.println(fare);
    }



    public List<Person> people () {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John","Doe",18,"student","portharcourt"));
        personList.add(new Person("Kelvin","Wells",35,"Marketer","Indiana"));
        personList.add(new Person("Kerry","Combs",28,"Nurse","Alabama"));
        personList.add(new Person("Paul","Wick",19,"chef","Alaska"));
        return personList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", residence='" + residence + '\'' +
                '}';
    }
}
