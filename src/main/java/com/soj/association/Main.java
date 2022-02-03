package com.soj.association;

import com.soj.association.aggregation.Department;
import com.soj.association.aggregation.Institute;
import com.soj.association.aggregation.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static final Logger logger= LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){
        Student s1=new Student(1,"Mia","CSE");
        Student  s2=new Student(2,"Priya","CSE");
        Student s3=new Student(1,"John","EE");
        Student  s4=new Student(2,"Jack","EE");

        List<Student> cseStudents=new ArrayList<>();
        cseStudents.add(s1);
        cseStudents.add(s2);
        List<Student> eeStudents=new ArrayList<>();
        eeStudents.add(s3);
        eeStudents.add(s4);

        Department cSE=new Department("CSE",cseStudents);
        Department eE=new Department("EE",eeStudents);

        List<Department> departmentList=new ArrayList<>();
        departmentList.add(cSE);
        departmentList.add(eE);

        Institute institute=new Institute("HIGH LAND",departmentList);

        logger.debug("total students in institute:");
        logger.debug(institute.getTotalStudentInInstitute());
        logger.debug(institute.getInstituteName());


    }
}
