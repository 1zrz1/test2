package com.serverdatabase.controller;

import com.serverdatabase.domain.Student;
import com.serverdatabase.service.StudentService;
import com.serverdatabase.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public R getAll(){
        return new R(true,studentService.getAll());
    }

    @PostMapping
    public R save(@RequestBody Student student){
        return new R(studentService.save(student));
    }

    @PutMapping
    public R update(@RequestBody Student student){
        return new R(studentService.update(student));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(studentService.delete(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,studentService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return new R(true,studentService.getPage(currentPage,pageSize));
    }
}
