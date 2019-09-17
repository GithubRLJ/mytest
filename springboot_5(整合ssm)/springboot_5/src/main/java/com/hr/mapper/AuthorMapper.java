package com.hr.mapper;

import com.hr.entity.Author;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 作者表       他是属于1的一方
 */
public interface AuthorMapper {

    @Select("select * from author where aid = #{aid}")
    public Author queryAuthorById(int aid);



    @Select("select * from author")
    @Results(id = "atMap",value = {
            @Result(id = true,property = "aid",column = "aid"),
            @Result(property = "aname",column = "aname"),
            @Result(property = "blist",column = "aid",many =
                @Many(select = "com.hr.mapper.BookMapper.queryBookById")
            )

    })
    public List<Author> queryAuthor();



}