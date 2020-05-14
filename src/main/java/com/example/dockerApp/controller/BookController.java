package com.example.dockerApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockerApp.BookService;

@RestController
public class BookController {
	
	private BookService bookservice;
	
	
	
	public BookController(BookService bookservice) {
		super();
		this.bookservice = bookservice;
	}



	@GetMapping(value="/books")
	public ResponseEntity getBooks()
	{
		return ResponseEntity.ok().body(bookservice.getbooks()) ;
	
	}

}
