package com.wildcodeschool.rest_quest.controller;

import com.wildcodeschool.rest_quest.entity.Book;
import com.wildcodeschool.rest_quest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> index(){
        return bookRepository.findAll();
    }

    // TODO: compléter ce controller suivant les critères REST

}
