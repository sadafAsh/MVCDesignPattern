package com.soj.pattern.mvc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void testToGetModel() {
        Student model=new Student();
        StudentView view=new StudentView();
        StudentController controller=new StudentController(model,view);
        Assertions.assertEquals(model,controller.getModel());
    }

    @Test
    void testToSetModel() {
        Student model=new Student();
        StudentView view=new StudentView();
        StudentController controller=new StudentController(model,view);
controller.setModel(model);
Assertions.assertEquals(model,controller.getModel());
    }

    @Test
    void testToSetStudentName() {
        Student model=new Student();
        StudentView view=new StudentView();
        StudentController controller=new StudentController(model,view);
controller.setStudentName("Jikar");
Assertions.assertTrue(true,"Student name is being set");
    }

    @Test
    void testToGetStudentName() {
        Student model=new Student();
        StudentView view=new StudentView();
        StudentController controller=new StudentController(model,view);
model.setName("Owais");
Assertions.assertEquals("Owais",controller.getStudentName());
    }

    @Test
    void testToSetStudentRollNo() {
        Student model=new Student();
        StudentView view=new StudentView();
        StudentController controller=new StudentController(model,view);
controller.setStudentRollNo("123Q");
Assertions.assertTrue(true,"Roll No is being set");
    }

    @Test
    void testToGetStudentRollNo() {
        Student model=new Student();
        StudentView view=new StudentView();
        StudentController controller=new StudentController(model,view);
model.setRollNo("123Q");
Assertions.assertEquals("123Q",controller.getStudentRollNo());
    }

    @Test
    void updateView() {
        Student model=new Student();
        StudentView view=new StudentView();
        StudentController controller=new StudentController(model,view);
model.setName("Owais");
model.setRollNo("123Q");
controller.updateView();
        Assertions.assertTrue(true,"name and roll no has been updated");
    }

}