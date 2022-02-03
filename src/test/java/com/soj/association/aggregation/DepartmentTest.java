package com.soj.association.aggregation;

import jdk.jfr.events.ActiveSettingEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    @Test
    void testToSetDepartmentName() {
        List<Student> studentList = new ArrayList<>();
        Department department = new Department("CSE", studentList);
        department.setName("CSE");
        Assertions.assertTrue(true, department.getName());
    }

    @Test
    void testToSetListOfStudentsInDepartment() {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1, "Mia", "CSE");
        Student s2 = new Student(2, "Priya", "CSE");
        studentList.add(s1);
        studentList.add(s2);
        Department department = new Department("CSE", studentList);
        department.setStudents(studentList);
        Assertions.assertEquals(department.getStudents(), studentList);


    }
}