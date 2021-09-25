package com.mengyu.repository;

import com.mengyu.entity.Student;

import java.util.Collection;

/**
 * @Author mengyu
 * @Date 2021/9/24 11:07
 * @Version 1.0
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
