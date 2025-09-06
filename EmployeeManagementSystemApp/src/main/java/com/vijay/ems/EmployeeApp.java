package com.vijay.ems;

import java.time.LocalDate;

public class EmployeeApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management System");
        EmployeeService service = new EmployeeService();

        Employee e1=new Employee(1,"Vijay",97000,"Software Engineering", LocalDate.of(2024,10,30));
        Employee e2=new Employee(2,"Hima",96000,"Software Engineering", LocalDate.of(2022,5,20));

        service.addEmployee(e1);
        service.addEmployee(e2);

        System.out.println("All Employees: "+service.getAllEmployees());

        System.out.println("Employee 1:"+service.getEmployee(1));

        service.updateSalary(2,107000);

        System.out.println("All Employees after salary update: "+service.getAllEmployees());

        System.out.println("Employee 2 left the organization");
        service.deleteEmployee(2);

        System.out.println("All active Employees"+service.getAllEmployees());
    }
}
