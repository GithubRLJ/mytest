package com.hr.mapper;

import com.hr.entity.Student;
import com.hr.entity.Student2;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*@Mapper    只有有了Mapper注解才有mapper对象    如果不在这里配，就需要在启动器上配置*/
public interface StudentMapper {

    @Select("select * from student")
    public List<Student> queryStudent();

    @Select("select * from student")
    @ResultMap("stuMap")
    public List<Student2> queryStudent2();

    @Select("select * from student")
    @Results(id="stuMap2",value = {
            @Result(id = true,property = "s_id",column = "sid"),
            @Result(property = "s_name",column = "sname")
    })
    public List<Student2> queryStudent3();


    @Delete("delete from student where sid = #{sid}")
    public void deleteStudent(int sid);

    @Insert("insert into student (sname,age,created) values(#{sname},#{age},#{created})")
    @Options(useGeneratedKeys = true,keyColumn = "sid",keyProperty = "sid")
    public void addStudent(Student s);

    @Select("select * from student where sid =#{sid}")
    public Student queryStudentById(int sid);

    @Update("update student set sname=#{sname},age=#{age},created=#{created} where sid = #{sid}")
    public void updateStudent(Student s);
}
