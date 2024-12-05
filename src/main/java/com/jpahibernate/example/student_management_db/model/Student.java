package com.jpahibernate.example.student_management_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity //refers to model or entity which directly represents the database table
@Table(name ="student")// creates a table inside the database
public class Student {

    @Id //It is primary key and it cannot take duplicate values
    @Column(name = " studentId") //creates a column in database *by default takes the below parameter
    private int studentId;

    @Column(name="name",nullable = false)//nullable- means it is a mandatory field and cannot be empty
    private String name;

    @Column(name = "email",nullable = false,unique = true)// unique- takes unique values
    private String email;

    @Column(name = "grade",nullable = false)
    private String grade;

    @Column (name = "dob",nullable = false)
    private String dob;

    @Column(name="password",nullable = false)
    private String password;
}
