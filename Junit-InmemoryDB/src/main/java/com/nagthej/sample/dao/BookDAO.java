package com.nagthej.sample.dao;

import java.util.List;

import com.nagthej.sample.model.Book;

public interface BookDAO {
	
	public Book getBookById(Integer id);
	
	public boolean addBook(Book book);
	
	public List<Book> getAllBooks();

}
