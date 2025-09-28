package edu.icet.service;

import edu.icet.model.Book;
import edu.icet.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;


    public void getAllDetaiils(){
        bookRepository.findAll();
    }

    public void add(){
        Book book= new Book(
                6L,
                "Madol Duwa",
                "Martin",
                "Sarasavi",
                "978-955",
                "Sinhala Lit",
                12
        );

        bookRepository.save(book);
        System.out.println(book);
    }

}
