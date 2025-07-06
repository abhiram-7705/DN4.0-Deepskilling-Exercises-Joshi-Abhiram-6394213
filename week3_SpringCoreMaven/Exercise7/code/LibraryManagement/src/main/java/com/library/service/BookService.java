package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	BookRepository bookRepository1,bookRepository2;

	public BookService(BookRepository bookRepository) {
		this.bookRepository1 = bookRepository;
	}
	
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository2 = bookRepository;
	}

	public void addBook(String bookName)
	{
		bookRepository1.save(bookName);
		bookRepository2.save(bookName);
	}
}
