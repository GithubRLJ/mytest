package com.hr.service.impl;

import com.hr.entity.Student;
import com.hr.mapper.StudentMapper;
import com.hr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryStudent() {
        return studentMapper.queryStudent();
    }

    @Override
    public void deleteStudent(int sid) {
        studentMapper.deleteStudent(sid);
    }

    @Override
    public void addStudent(Student s) {
        studentMapper.addStudent(s);
    }

    @Override
    public Student queryStudentById(int sid) {
        return studentMapper.queryStudentById(sid);
    }

    @Override
    public void updateStudent(Student s) {
        studentMapper.updateStudent(s);
    }
}
