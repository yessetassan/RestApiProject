package com.example.Rest_api_PostMan.controllers;

import com.example.Rest_api_PostMan.models.Deal;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/credit")
public class WelcomeController{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public WelcomeController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PutMapping
    public void create(@RequestParam(name = "book_id") int book_id, @RequestParam(name = "reader_id") int reader_id, @RequestParam(name = "str", required = false)String str) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime get_on = LocalDateTime.now();
        LocalDateTime give_on = LocalDateTime.parse(str,dateTimeFormatter);

        if (!get_on.isBefore(give_on)) {
            throw new IllegalStateException("Not allowed before date !");
        }
        String sql = "insert into deal values(?,?,?,?)";
        jdbcTemplate.update(sql, book_id, reader_id,get_on,give_on);
    }

    @PostMapping("/good")
    public void good(@RequestBody String jsonString) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            Map<String, Object> dataMap = objectMapper.readValue(jsonString, Map.class);

            String name = (String) dataMap.get("name");
            int age = (int) dataMap.get("age");
            String email = (String) dataMap.get("email");

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
