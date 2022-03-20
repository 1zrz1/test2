package com.serverdatabase.service;

import com.serverdatabase.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTestCase {

    @Autowired
    private StudentService studentService;

    @Test
    void testGetById(){
        System.out.println(studentService.getById(1));
    }

    @Test
    void testSave() {
        Student student = new Student();
        student.setName("王五");
        studentService.save(student);
    }

    @Test
    void testDelete(){
        studentService.delete(0);
    }
}
