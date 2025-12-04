package com.devops.microservices.books.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devops.microservices.books.model.Book;
import com.devops.microservices.books.repository.BookRepository;

@Service
public class BookService {
	
    private final BookRepository bookRepo;

    public BookService(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public Book updateBook(Long id, Book book) {
        book.setId(id);
        return bookRepo.save(book);
    }

    public void deleteBook(Long id) {
    	bookRepo.deleteById(id);
    }

}
