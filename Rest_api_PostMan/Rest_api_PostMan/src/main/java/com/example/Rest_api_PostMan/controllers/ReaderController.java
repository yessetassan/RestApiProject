package com.example.Rest_api_PostMan.controllers;

import com.example.Rest_api_PostMan.models.Book;
import com.example.Rest_api_PostMan.models.Reader;
import com.example.Rest_api_PostMan.services.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/readers")
public class ReaderController {

    private final ReaderService readerService;

    @Autowired
    public ReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }

    @GetMapping
    public List<Reader> all() {
        return readerService.all();
    }

    @PostMapping
    public void add(@RequestBody Reader reader) {
        readerService.add(reader);
    }

    @GetMapping(path = "/{id}")
    public Reader byId(@PathVariable("id") Long id) {
        return readerService.byId(id);
    }


}
