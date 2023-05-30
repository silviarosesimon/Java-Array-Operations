package com.ds.hash;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Adam","Technology");
        Employee employee2 = new Employee(2,"Becky","Marketing");
        Employee employee3 = new Employee(3,"Cathy","Sales");

        HashMap<Integer,Employee> employeeHashMap = new HashMap<>();
        employeeHashMap.put(employee1.id,employee1);
        employeeHashMap.put(employee2.id,employee2);
        employeeHashMap.put(employee3.id,employee3);

        Employee employee = employeeHashMap.get(2);
        if(employee != null) {
            System.out.println(employee.name + " " + employee.department);
        }

        HashSet<String> productCodes = new HashSet<>();
        productCodes.add("23we");
        productCodes.add("4334dfs");
        productCodes.add("34xvc");

        System.out.println(productCodes.contains("23we"));
        System.out.println(productCodes.contains("323"));
    }
}
