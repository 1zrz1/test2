package com.serverdatabase.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.serverdatabase.domain.Student;

import java.util.List;

public interface StudentService {
    Boolean save(Student student);
    Boolean update(Student student);
    Boolean delete(Integer id);
    Student getById(Integer id);
    List<Student> getAll();
    IPage<Student> getPage(int currenPage, int pageSize);
}
