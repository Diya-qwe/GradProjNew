
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest {


    StudentGrade student = new StudentGrade();

    @Test
    void testGradeA() {
        assertEquals('A', student.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals('B', student.calculateGrade(85));
    }

    @Test
    void testGradeC() {
        assertEquals('C', student.calculateGrade(75));
    }

    @Test
    void testGradeD() {
        assertEquals('D', student.calculateGrade(65));
    }

    @Test
    void testGradeE() {
        assertEquals('E', student.calculateGrade(50));
    }

    @Test
    void testFailGrade() {
        assertEquals('F', student.calculateGrade(30));
    }

    @Test
    void testInvalidMarks() {
        assertThrows(IllegalArgumentException.class,
                () -> student.calculateGrade(110));
    }
}
