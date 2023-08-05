package com.example.Rest_api_PostMan.repositories;

import com.example.Rest_api_PostMan.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
}
