package com.example.Rest_api_PostMan.services;

import com.example.Rest_api_PostMan.models.Reader;
import com.example.Rest_api_PostMan.repositories.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ReaderService {

    private final ReaderRepository readerRepository;

    @Autowired
    public ReaderService(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }

    public List<Reader> all() {
        return readerRepository.findAll();
    }
    @Transactional
    public void add(Reader reader) {
        readerRepository.save(reader);
    }

    public Reader byId(Long id) {
        return readerRepository.findById(id).orElse(null);
    }

}
