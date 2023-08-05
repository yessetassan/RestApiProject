package com.example.Rest_api_PostMan.services;

import com.example.Rest_api_PostMan.models.Book;
import com.example.Rest_api_PostMan.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> all() {
        return bookRepository.findAll();
    }
    @Transactional
    public void add(List< Book > book) {
        book.forEach(x -> bookRepository.save(x));
    }
}
