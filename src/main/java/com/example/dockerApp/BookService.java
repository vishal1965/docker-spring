package com.example.dockerApp;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Service;

import com.example.dockerApp.repo.BookRepository;

@Service
public class BookService {

	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	public List<BookEntity> getbooks()
	{
	 return	bookRepository.findAll();
	}
	
}
