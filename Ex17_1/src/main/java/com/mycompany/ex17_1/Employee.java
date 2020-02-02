/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex17_1;

/**
 *
 * @author treba
 */
public class Employee implements Person{
        
    private String email;
    private String name;
    private String department;

    public Employee(String email, String name, String department) {

        this.email = email;
        this.name = name;
        this.department = department;
    }

    @Override
    public String getEmail() {

        return this.email;
    }

    @Override
    public String getName() {

        return this.name;
    }

    public String getDepartment() {

        return this.department;
    }

    @Override
    public String getDescription() {

        return getName() + " works in " + getDepartment();
    }
}
