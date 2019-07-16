package com.tw.apistackbase.Model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static List<Employee> forTestEmployee(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Jerry",18,"Male"));
        return list;
    }

    public Employee() { }

    public Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
