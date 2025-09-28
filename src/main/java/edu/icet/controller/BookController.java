package edu.icet.controller;

import edu.icet.service.BookService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // @Controller  @ResponseBody //retun json, xml type of values
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping
    public void add(){
        bookService.add();




    }



}
