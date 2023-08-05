package com.example.Rest_api_PostMan.controllers;

import com.example.Rest_api_PostMan.models.Book;
import com.example.Rest_api_PostMan.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> all() {
        return bookService.all();
    }

    @PutMapping
    public void add(@RequestBody List<Book> book) {
        bookService.add(book);
    }

}

