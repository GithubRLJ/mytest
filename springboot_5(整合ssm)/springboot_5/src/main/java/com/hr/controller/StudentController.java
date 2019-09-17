package com.hr.controller;

import com.hr.entity.Student;
import com.hr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("query")
    public String query(ModelMap map){

        map.addAttribute("slist",studentService.queryStudent());

        return "query";
    }



    @RequestMapping("delete")
    public String delete(int sid){

        studentService.deleteStudent(sid);


        return "redirect:/query";
    }


    @RequestMapping("add")
    public String add(Student s){

        System.out.println("新增之前："+s);

        studentService.addStudent(s);

        System.out.println("新增之后："+s);

        return "redirect:/query";
    }


    @RequestMapping("goUpdate")
    public String goUpdate(int sid,ModelMap map){

        Student s = studentService.queryStudentById(sid);

        map.addAttribute("stu",s);

        return "update";
    }

    @RequestMapping("update")
    public String update(Student s){

        studentService.updateStudent(s);

        return "redirect:/query";
    }
}
