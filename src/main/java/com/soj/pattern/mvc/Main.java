package com.soj.pattern.mvc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){
Student model=retriveStudentFromDatabase();
StudentView view=new StudentView();
StudentController controller=new StudentController(model,view);
controller.updateView();
controller.setStudentName("Tony Stark");
controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student=new Student();
        student.setName("Viki Sharma");
        student.setRollNo("123A");
        return student;
    }
}
