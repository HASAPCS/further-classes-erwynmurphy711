package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest {
    @Test
    public void testDepartmentInitializationAndEmployeeAddition() {
        Department department = new Department("IT");
        assertEquals("IT", department.getName());

        Employee employee = new Employee("John Doe", 1, 50000, "IT");
        department.addEmployee(employee);
        assertEquals(1, department.getEmployees().size());
        assertEquals(employee, department.getEmployees().get(0));
    }

}
