package com.example.dockerApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dockerApp.BookEntity;

public interface BookRepository  extends JpaRepository<BookEntity,String> {

    BookEntity findById(Long id);

}
