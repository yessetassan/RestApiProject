package com.example.Rest_api_PostMan.repositories;

import com.example.Rest_api_PostMan.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
