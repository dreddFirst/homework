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
public class Student implements Person{
    
    private String email;
    private String name;
    private String grade;
    
        public Student(String email, String name, String grade) {

        this.email = email;

        this.name = name;

        this.grade = grade;

    }
        
    @Override
    public String getEmail() {

        return this.email;

    }

    @Override
    public String getName() {

        return this.name;

    }

    public String getGrade() {

        return this.grade;

    }

    @Override
    public String getDescription() {

//        return "A " + getGrade() + " grade stundet.";

        return "A " + grade + " grade stundet.";

    }
}
