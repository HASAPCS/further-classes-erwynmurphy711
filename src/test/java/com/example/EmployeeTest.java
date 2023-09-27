package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void testEmployeeInitialization() {
        Employee employee = new Employee("John Doe", 1, 50000, "IT");
        assertEquals("John Doe", employee.getName());
        assertEquals(1, employee.getId());
        assertEquals(50000, employee.getSalary());
        assertEquals("IT", employee.getDepartment());
    }

}
