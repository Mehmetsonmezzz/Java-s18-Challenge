package com.workintech.s18challenge.service;

import com.workintech.s18challenge.entity.Book;
import com.workintech.s18challenge.repository.BookRepository;

import java.util.Optional;

public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book findById(long id) {
        Optional<Book> optionalBook=bookRepository.findById(id);
        if(optionalBook.isPresent()){
           return optionalBook.get();
        }
       throw new RuntimeException("Author with given id is not found: "+id);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
