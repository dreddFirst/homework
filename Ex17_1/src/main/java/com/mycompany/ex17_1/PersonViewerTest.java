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
public class PersonViewerTest {
        public static void main(String[] args) {

        Person student = new Student("email@email.com", "Melnic Nicolae", "B");
        Lecturer lecturer = new Lecturer("email1@email.com", "Gavrilita Victoria", "Math");
        Employee employee = new Employee("email2@gmail.com", "Cucos Nadejda", "HR");
        
        PersonViewer p = new PersonViewer();

       p.view(student);

       p.view(lecturer);

       p.view(employee);

//       EnhancedPersonViewer p = new EnhancedPersonViewer();
//
//       p.view(student);
//
//       p.view(lecturer);
//
//        p.view(employee);

    }
}
