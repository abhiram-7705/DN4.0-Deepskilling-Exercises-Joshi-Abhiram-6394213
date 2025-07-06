package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.model.Book;
import com.library.repository.BookRepository;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@GetMapping("/getBooks")
	public List<Book> getBooks()
	{
		return repository.findAll();
	}
	@PostMapping("/addBooks")
	public void addBooks(
			@RequestParam("name") String name
			)
	{
		Book book=new Book();
		book.setBook_name(name);
		repository.save(book);
	}
	
}
