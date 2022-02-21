package com.soj.pattern.mvc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testToSetNameOfStudents() {
        Student student=new Student();
        student.setName("Tony");
        Assertions.assertEquals("Tony",student.getName());
    }

    @Test
    void testToSetRollNoOfStudents() {
        Student student=new Student();
        student.setRollNo("123Q");
        Assertions.assertEquals("123Q",student.getRollNo());
    }
}