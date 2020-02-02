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
public class EnhancedPersonViewer extends PersonViewer{
            
    @Override
    public void view(Person person) {

        if (person instanceof Student) {

            viewPerson((Student) person);

        } else if (person instanceof Lecturer) {

            viewPerson((Lecturer) person);

        } else {

            viewPerson((Employee) person);

        }

    }

    public void viewPerson(Student student) {

        System.out.println("Student:");

        super.view(student);

    }

    public void viewPerson(Lecturer lecturer) {

        System.out.println("Lecturer:");

        super.view(lecturer);

    }

    public void viewPerson(Employee employee) {

        System.out.println("Employee:");

        super.view(employee);

    }
}
