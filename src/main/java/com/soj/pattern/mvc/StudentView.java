package com.soj.pattern.mvc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StudentView {
static final Logger logger= LogManager.getLogger(StudentView.class.getName());
    public void printStudentDetails(String studentName,String studentRollNo){
        logger.debug("Student: ");
        logger.debug("Name : {} ",studentName);
        logger.debug("Roll No : {} ",studentRollNo);
    }
}
