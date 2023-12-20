package com.workintech;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1,"Emre","Özenses");
        Employee employee2 = new Employee(2,"Erdi","Özenses");
        Employee employee3 = new Employee(3,"Gökşen","Özenses");
        Employee employee4 = new Employee(2,"Ahmet","Özenses");
        Employee employee5 = new Employee(4,"Burçin","Özenses");
        Employee employee6 = new Employee(1,"Emre","Özenses");

        List<Employee> employeeList = new LinkedList<>();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        System.out.println("mevcut");
        System.out.println(employeeList);
        Map<Integer , Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator<Employee> listItem = employeeList.iterator();
        while (listItem.hasNext()){
            Employee employee = listItem.next();
            if(employee == null){
                System.out.println("null data bulundu");
                continue;
            }
            if(employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
                listItem.remove();
            }
            else{
                employeeMap.put(employee.getId(),employee);
            }

        }


        System.out.println("unique olanlar");
        System.out.println(employeeMap);
        System.out.println("silinenler");
        System.out.println(removedEmployees);





    }
}