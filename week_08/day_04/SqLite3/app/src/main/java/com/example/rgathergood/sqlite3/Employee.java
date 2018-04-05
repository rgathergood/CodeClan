package com.example.rgathergood.sqlite3;

/**
 * Created by rgathergood on 22/03/2018.
 */

public class Employee {
    int id;
    String name, dept, joiningdate;
    double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getJoiningdate() {
        return joiningdate;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(int id, String name, String dept, String joiningdate, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.joiningdate = joiningdate;
        this.salary = salary;
    }
}


