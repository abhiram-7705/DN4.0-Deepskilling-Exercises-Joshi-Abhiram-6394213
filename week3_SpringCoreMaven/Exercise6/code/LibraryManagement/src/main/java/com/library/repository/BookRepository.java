package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	public void save(String name)
	{
		System.out.println("book saved : "+name);
	}
}
