package edu.icet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // @Controller  @ResponseBody //retun json, xml type of values


public class BookController {

    @GetMapping
    public String getName(){
        return "blaa";
    }



}
