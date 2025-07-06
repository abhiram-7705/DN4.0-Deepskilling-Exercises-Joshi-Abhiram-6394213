package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	
	private BookRepository repository;

	public BookService(BookRepository repository) {
		this.repository = repository;
	}
	
	public void saveBook(String bookname)
	{
		repository.save(bookname);
	}
	

}
