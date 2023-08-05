package com.example.Rest_api_PostMan.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "deal")
public class Deal {
    @Id
    @Column(name = "book_id")
    private Long book_id;
    @Column(name = "reader_id")
    private Long reader_id;
    @Column(name = "get_on")
    private LocalDateTime get_on;
    @Column(name = "give_on")
    private LocalDateTime give_on;
    @Column(name = "message")
    private String message;


    public Deal() {

    }

    public Deal(Long book_id, Long reader_id, LocalDateTime get_on, LocalDateTime give_on) {
        this.book_id = book_id;
        this.reader_id = reader_id;
        this.get_on = get_on;
        this.give_on = give_on;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public Long getReader_id() {
        return reader_id;
    }

    public void setReader_id(Long reader_id) {
        this.reader_id = reader_id;
    }

    public LocalDateTime getGet_on() {
        return get_on;
    }

    public void setGet_on(LocalDateTime get_on) {
        this.get_on = get_on;
    }

    public LocalDateTime getGive_on() {
        return give_on;
    }

    public void setGive_on(LocalDateTime give_on) {
        this.give_on = give_on;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
