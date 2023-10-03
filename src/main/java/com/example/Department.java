package com.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employeelist;

    public Department(String name) {
        this.name = name;
        this.employeelist = new ArrayList<Employee>();
        
        // TODO: Initialize the attributes
    }
    public void addEmployee(Employee employee){
        employeelist.add(employee);
    }
    public void removeEmployee(Employee employee){
        employeelist.remove(employee);
    }
    public String getName(){
        return this.name;
    }
    public double getAverage(){
        double average = 0;
        for(Employee employee: employeelist){
            average += employee.getSalary();
        }
        average = average/employeelist.size();
        return average;
    }
    public List<Employee> getEmployees(){
        return employeelist;
    }
    // TODO: Implement methods to add an employee, remove an employee, and calculate the average salary for the department
}
