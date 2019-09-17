package com.hr;

import com.hr.entity.Author;
import com.hr.entity.Book;
import com.hr.entity.Student2;
import com.hr.mapper.AuthorMapper;
import com.hr.mapper.BookMapper;
import com.hr.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot5ApplicationTests {

	@Autowired
	private StudentMapper studentMapper;


	public void contextLoads() {

		List<Student2> slist = studentMapper.queryStudent3();

		for (Student2 s: slist
			 ) {
			System.out.println(s);
		}


	}


	@Autowired
	private BookMapper bookMapper;

	public void test(){

		List<Book> blist = bookMapper.queryBookList();

		for (Book b: blist
			 ) {

			System.out.println(b);

		}

	}

	@Autowired
	private AuthorMapper authorMapper;

	@Test
	public void test2(){

		List<Author> alist = authorMapper.queryAuthor();

		for (Author a: alist
				) {

			System.out.println(a);

		}

	}

}
