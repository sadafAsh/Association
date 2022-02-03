package com.soj.association.aggregation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InstituteTest {
    @Test
    void TestToSetTheInstituteName() {
        List<Department> departments = new ArrayList<>();
        Institute institute = new Institute("CSE", departments);
        institute.setInstituteName("CSE");
        Assertions.assertTrue(true, institute.getInstituteName());
    }

    @Test
    void setDepartments() {
        List<Department> departments = new ArrayList<>();
        Institute institute = new Institute("CSE", departments);
        institute.setDepartments(departments);
        Assertions.assertEquals(departments, institute.getDepartments());


    }

    @Test
    void getTotalStudentInInstitute() {
        List<Department> departments = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1, "Mia", "CSE");
        Student s2 = new Student(2, "Priya", "CSE");
        studentList.add(s1);
        studentList.add(s2);
        Department cSE = new Department("CSE", studentList);
        departments.add(cSE);
        Institute institute = new Institute("CSE", departments);
        int total = institute.getTotalStudentInInstitute();
        Assertions.assertEquals(2, total);
    }
}