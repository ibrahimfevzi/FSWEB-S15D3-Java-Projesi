package com.workintech.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(1, "Ibrahim", "Kayan"));
        employeeList.add(new Employee(2, "Kerem", "Kayan"));
        employeeList.add(new Employee(3, "Humeyra", "Kayan"));
        employeeList.add(new Employee(1, "Ibrahim", "Kayan")); // Duplicate
        employeeList.add(new Employee(4, "Cem", "Karaca"));
        employeeList.add(new Employee(2, "Kerem", "Kayan")); // Duplicate

        LinkedList<Employee> duplicateList = new LinkedList<>();
        HashMap<Integer, Employee> uniqueMap = new HashMap<>();

        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (uniqueMap.containsKey(employee.getId())) {
                duplicateList.add(employee);
                iterator.remove(); // Remove duplicate from original list
            } else {
                uniqueMap.put(employee.getId(), employee);
            }
        }

        System.out.println("Duplicate Employees:");
        for (Employee duplicateEmployee : duplicateList) {
            System.out.println(duplicateEmployee.getFullName());
        }

        System.out.println("\nUnique Employees:");
        for (Employee uniqueEmployee : uniqueMap.values()) {
            System.out.println(uniqueEmployee.getFullName());
        }



    }
}