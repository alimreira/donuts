package com.doughShop.doughnuts.oop.collections;

import com.doughShop.doughnuts.oop.Employee;

import java.util.*;

public class TestMain {

    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee("Dan", "Alfred", 36, "architect", "Michighan", "AR009", 78445f, "senior"));
        employeeList.add(new Employee("Sarah", "Montgomery", 28, "script writer", "Alabama", "AR002", 4321f, "junior"));
        employeeList.add(new Employee("Jaden", "Martins", 31, "researcher", "Alaska", "AR005", 67845f, "senior"));
        employeeList.add(new Employee("MaryAnne", "Bluemoerth", 23, "production intern", "Michigan", "INT0021", 1200f, "entry"));
        employeeList.add(new Employee("Josh", "Smith", 33, "reporter", "Indiana", "AR0012", 459789f, "management"));
        employeeList.add(new Employee("Michael", "Harry", 45, "board member", "New york", "AROO18", 819071f, "management"));

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Grace", "Sandy", 16, "swim instructor", "Chicago", "qw003", 234f, "volunteer"));
        employees.add(new Employee("Manuel", "Bob", 22, "life guard", "Vegas", "qr005", 453f, "junior"));
        employees.add(new Employee("Rachael", "Rands", 23, "counsellor", "Salt Lake", "qr034", 506f, "junior"));
        employeeList.addAll(employees);

        Employee ee = employeeList.get(4);
        System.out.println(ee);

        int all = employeeList.size();
        System.out.println(all);

        employeeList.set(8, new Employee("Jerry", "Manuel", 24, "life guard", "California", "qr005", 432f, "junior"));
        Employee e1 = employeeList.get(8);
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getOccupation());

        Iterator<Employee> it = employeeList.iterator();
        while (it.hasNext()) {
            Employee ee12 = it.next();
            System.out.println(ee12);
        }

        System.out.println();
        for (Employee ee13 : employeeList) {
            System.out.println(ee13);
        }

        //SET version
        System.out.println();
        System.out.println();
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee("Michael", "Harry", 45, "board member", "New york", "AROO18", 819071f, "management"));
        employeeSet.add(new Employee("Josh", "Smith", 33, "reporter", "Indiana", "AR0012", 459789f, "management"));
        employeeSet.add(new Employee("Dan", "Alfred", 36, "architect", "Michighan", "AR009", 78445f, "senior"));
        employeeSet.add(new Employee("Sarah", "Montgomery", 28, "script writer", "Alabama", "AR002", 4321f, "junior"));
        employeeSet.add(new Employee("MaryAnne", "Bluemoerth", 23, "production intern", "Michigan", "INT0021", 1200f, "entry"));
        employeeSet.add(new Employee("Jaden", "Martins", 31, "researcher", "Alaska", "AR005", 67845f, "senior"));

        employeeSet.addAll(employees);

        System.out.println(employeeSet.size());

        Iterator<Employee> eer = employeeSet.iterator();
        while (eer.hasNext()){
            Employee pl = eer.next();
            System.out.println(pl);
        }

        //HashMap version
        System.out.println();
        System.out.println();
        System.out.println();
        Map<Integer,Employee> employeeMap = new HashMap<>();
        employeeMap.put(1,new Employee("Michael", "Harry", 45, "board member", "New york", "AROO18", 819071f, "management"));
        employeeMap.put(2,new Employee("Dan", "Alfred", 36, "architect", "Michighan", "AR009", 78445f, "senior"));
        employeeMap.put(3,new Employee("Jaden", "Martins", 31, "researcher", "Alaska", "AR005", 67845f, "senior"));
        employeeMap.put(4,new Employee("MaryAnne", "Bluemoerth", 23, "production intern", "Michigan", "INT0021", 1200f, "entry"));
        employeeMap.put(5,new Employee("Josh", "Smith", 33, "reporter", "Indiana", "AR0012", 459789f, "management"));
        employeeMap.put(6,new Employee("Sarah", "Montgomery", 28, "script writer", "Alabama", "AR002", 4321f, "junior"));

        System.out.println(employeeMap.size());

        System.out.println(employeeMap.get(4));

        System.out.println(employeeMap.containsValue(new Employee("Sarah", "Montgomery", 28, "script writer", "Alabama", "AR002", 4321f, "junior")));
        System.out.println(employeeMap.containsKey(2));

        Set<Map.Entry<Integer,Employee>> jlf2 = employeeMap.entrySet();
        Iterator<Map.Entry<Integer,Employee>> itMap =jlf2.iterator();
        while (itMap.hasNext()){
            Map.Entry<Integer,Employee> inn = itMap.next();
            //System.out.println(inn);
            System.out.println(inn.getValue());
            //System.out.println(inn.getKey());
        }

        Set<Integer> jlf21 = employeeMap.keySet();
        Iterator<Integer> in = jlf21.iterator();
        while (in.hasNext()){
            Integer al = in.next();
            System.out.println(al);
        }


        Collection<Employee> em3 = employeeMap.values();
        Iterator<Employee> itr = em3.iterator();
        while (itr.hasNext()){
            Employee em = itr.next();
            System.out.println(em);
        }

    }
}