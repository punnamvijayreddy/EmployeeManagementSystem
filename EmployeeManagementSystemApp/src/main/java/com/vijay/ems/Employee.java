package com.vijay.ems;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private LocalDate joinDate;
    public Employee(int id, String name, double salary, String department, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.joinDate = joinDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
