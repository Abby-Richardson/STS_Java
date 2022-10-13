package com.abby.bookclubfullspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abby.bookclubfullspring.models.Book;
import com.abby.bookclubfullspring.repositories.BookRepository;

@Service
public class BookService {

	public final BookRepository bookRepo;
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public Book getOne(Long id) {
        Optional<Book> book = bookRepo.findById(id);
        return book.isPresent() ? book.get() : null;
    }

    public List<Book> getAll() {
        return (List<Book>) bookRepo.findAll();
    }

    public Book create(Book dojo) {
        return bookRepo.save(dojo);
    }

    public Book update(Book dojo) {
        return bookRepo.save(dojo);
    }
    public void delete (Long id) {
        bookRepo.deleteById(id);
    }

}
