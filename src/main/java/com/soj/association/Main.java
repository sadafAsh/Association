package com.soj.association;

import com.soj.association.aggregation.Department;
import com.soj.association.aggregation.Institute;
import com.soj.association.aggregation.Student;
import com.soj.association.composition.Book;
import com.soj.association.composition.Library;
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
logger.info("........................................................................");
logger.info("composition");
        Book book1=new Book("Head First java"," Kathy Sierra");
        Book book2=new Book("Clean Code","Robert.C.Martin");
        Book book3=new Book("Design pattern","Erich Gamma");
        List<Book> bookList=new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        Library library=new Library(bookList);
        int total=library.getTotalNoOfBooks();
        logger.debug("the total books in library is {}.",total);

       List<Book> books= library.getTotalBooksInLibrary();
        for(Book book:books){
            logger.debug("Title of the book is: {} , and its author is {}.",book.getTitle(),book.getAuthor());
        }


    }
}
