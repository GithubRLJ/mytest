package com.hr.entity;

import java.sql.Date;

public class Student2 {
    private Integer s_id;

    private String s_name;

    private Integer age;

    private Date created;

    @Override
    public String toString() {
        return "Student2{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", age=" + age +
                ", created=" + created +
                '}';
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}