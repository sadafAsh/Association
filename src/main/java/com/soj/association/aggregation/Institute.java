package com.soj.association.aggregation;

import java.util.List;

public class Institute {
    private String instituteName;
    private List<Department> departments;

    public Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public int getTotalStudentInInstitute() {
        int noOfStudents = 0;
        List<Student> students;

        for (Department department : departments) {
            students = department.getStudents();

            for (Student student : students) {
                student.getName();
                noOfStudents++;
            }
        }return noOfStudents;

    }
}
