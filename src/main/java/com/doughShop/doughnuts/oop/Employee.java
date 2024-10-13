package com.doughShop.doughnuts.oop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee extends Person {
    private String empId;
    private float salary;
    private String cadre;

    public static void main(String[] args) {
        Employee employee = new Employee("Dan","Alfred",36,"architect","Michighan","AR009",78445f,"senior");
        Employee employee1 = new Employee("Sarah","Montgomery",28,"script writer","Alabama","AR002",4321f,"junior");
        Employee employee2 =new Employee("Jaden","Martins",31,"researcher","Alaska","AR005",67845f,"senior");
        Employee employee3 = new Employee("MaryAnne","Bluemoerth",23,"production intern","Michigan","INT0021",1200f,"entry");
        Employee employee4 = new Employee("Josh","Smith",33,"reporter","Indiana","AR0012",459789f,"management");
        Employee employee5 = new Employee("Michael","Harry",45,"board member","New york","AROO18",819071f,"management");

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        list.stream().sorted((o1,o2)-> o1.getAge() - o2.getAge()).forEach((c)-> System.out.println(c.getFirstName()));

        //Anonymous impl for sorting
        List<Employee> list1 = list.stream().sorted((new Comparator<Employee> (){
            @Override
            public int compare (Employee o1, Employee o2){
                return o1.getCadre().compareTo(o2.getCadre());
            }
        })).collect(Collectors.toList());
        System.out.println(list1);

        //Comparator.comparing method without method reference
        Stream<Employee> str = list.stream().sorted(Comparator.comparing((x)-> x.salary));
        System.out.println(str.collect(Collectors.toList()));

    }

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age, String occupation,
                    String residence, String empId, float salary, String cadre) {
        super(firstName, lastName, age, occupation, residence);
        this.empId = empId;
        this.salary = salary;
        this.cadre = cadre;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getCadre() {
        return cadre;
    }

    public void setCadre(String cadre) {
        this.cadre = cadre;
    }

    public void costOfTransport (int milesFromHome, float costPerMile){
        float fare = (float) (milesFromHome * costPerMile);
        System.out.println(fare);
    }

    public int costOfTransport (float milesFromHome, float costPerMile){
        int fare = (int) (milesFromHome * costPerMile);
        return fare;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", salary=" + salary +
                ", cadre='" + cadre + '\'' +
                '}';
    }
}
