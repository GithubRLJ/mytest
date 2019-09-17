package com.hr.mapper;

import com.hr.entity.Book;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 *  图书表    它是属于  多的一方
 */
public interface BookMapper {

    @Select("select * from book")
    @Results(id = "bkMap",value = {
            @Result(id = true,property = "bid",column = "bid"),
            @Result(property = "bname",column = "bname"),
            @Result(property = "aid",column = "aid"),
            @Result(property = "author",column = "aid",
                    one = @One(select = "com.hr.mapper.AuthorMapper.queryAuthorById",fetchType = FetchType.LAZY))
    })
    public List<Book> queryBookList();

    @Select("select * from book where aid = #{aid}")
    public List<Book> queryBookById(int aid);



}