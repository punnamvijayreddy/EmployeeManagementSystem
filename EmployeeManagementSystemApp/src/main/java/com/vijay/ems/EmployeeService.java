package com.vijay.ems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    Map<Integer,Employee> employees=new HashMap<>();

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(),employee);
    }
    public Employee getEmployee(int id) {
        return employees.get(id);
    }
    public ArrayList<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }
    public void updateSalary(int id, double salary) {
        Employee employee=employees.get(id);
        employee.setSalary(salary);
    }
    public void deleteEmployee(int id) {
        employees.remove(id);
    }
}
