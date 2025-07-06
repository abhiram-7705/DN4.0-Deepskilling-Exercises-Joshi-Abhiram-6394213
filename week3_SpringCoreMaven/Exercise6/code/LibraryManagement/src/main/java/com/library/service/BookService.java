package com.library.service;

import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {
	BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public void addBook(String bookName)
	{
		bookRepository.save(bookName);
	}
}
