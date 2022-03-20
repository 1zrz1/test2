package com.serverdatabase.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.serverdatabase.dao.StudentDao;
import com.serverdatabase.domain.Student;
import com.serverdatabase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Boolean save(Student student) {
        return studentDao.insert(student) > 0;
    }

    @Override
    public Boolean update(Student student) {
        return studentDao.updateById(student) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return studentDao.deleteById(id) > 0;
    }

    @Override
    public Student getById(Integer id) {
        return studentDao.selectById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.selectList(null);
    }

    @Override
    public IPage<Student> getPage(int currenPage, int pageSize) {
        return null;
    }


}
