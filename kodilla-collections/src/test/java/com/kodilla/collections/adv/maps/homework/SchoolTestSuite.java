package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTestSuite {

    @Test
    public void shouldAddStudents(){
        //Given
        School school = new School("abc");
        //When
        Student student = new Student("Ewa", "Kowalska");
        //Then
        school.addStudent(student);
    }

    @Test
    public void shouldGiveSizeOfStudentsList(){
        //Given
        School school = new School("abc");
        //When
        school.addStudent(new Student("Ewa", "Kowalska"));
        school.addStudent(new Student("Piotr", "Nowak"));
        //Then
        assertEquals(2, school.giveSize());
    }

}