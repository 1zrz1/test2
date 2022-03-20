package com.serverdatabase.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentDaoTestCase {

    @Autowired
    private StudentDao studentDao;

    @Test
    void contextLoads() {
        System.out.println(studentDao.selectById(1));
    }

    @Test
    void testGetById() {
        studentDao.selectById(1);
    }
}
