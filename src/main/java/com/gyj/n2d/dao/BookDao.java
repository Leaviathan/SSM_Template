package com.gyj.n2d.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gyj.n2d.entity.Book;

public interface BookDao {
	Book queryById(long id);

	/**
	 * 查询所有图书
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	/**
	 * 减少馆藏数量
	 * 
	 * @param bookId
	 * @return 如果影响行数等于>1，表示更新的记录行数
	 */
	int reduceNumber(long bookId);
}
