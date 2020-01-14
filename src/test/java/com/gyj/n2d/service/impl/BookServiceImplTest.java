package com.gyj.n2d.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gyj.n2d.BaseTest;
import com.gyj.n2d.dto.AppointExecution;
import com.gyj.n2d.service.BookService;

public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testAppoint() throws Exception {
		long bookId = 1001;
		long studentId = 12345678910L;
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}
	

}