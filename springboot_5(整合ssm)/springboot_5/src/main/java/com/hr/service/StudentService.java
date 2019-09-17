package com.hr.service;

import com.hr.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> queryStudent();

    public void deleteStudent(int sid);

    public void addStudent(Student s);

    public Student queryStudentById(int sid);

    public void updateStudent(Student s);
}
