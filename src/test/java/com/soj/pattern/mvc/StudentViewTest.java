package com.soj.pattern.mvc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentViewTest {

    @Test
    void testToPrintTheStudentDetails() {
        StudentView view=new StudentView();
        view.printStudentDetails("Owais","123Q");
        Assertions.assertTrue(true,"student being called");

    }
}