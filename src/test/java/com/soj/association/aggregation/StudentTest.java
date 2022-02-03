package com.soj.association.aggregation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testToSetStudentId() {
        Student s1 = new Student(1, "Mia", "CSE");
        s1.setId(1);
        Assertions.assertEquals(1, s1.getId());
    }

    @Test
    void testToSetStudentName() {
        Student s1 = new Student(1, "Mia", "CSE");
        s1.setName("Mia");
        Assertions.assertEquals("Mia", s1.getName());
    }

    @Test
    void testToSetStudentDept() {
        Student s1 = new Student(1, "Mia", "CSE");
        s1.setDept("CSE");
        Assertions.assertEquals("CSE", s1.getDept());
    }
}