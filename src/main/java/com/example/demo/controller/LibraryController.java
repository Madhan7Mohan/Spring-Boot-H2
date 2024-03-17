package com.example.demo.controller;


import com.example.demo.model.LibraryModel;
import com.example.demo.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    LibraryService libraryservice;
@GetMapping("/getbooks")
    private List<LibraryModel> getAllBooks()
    {
        return libraryservice.getAllBooks();
    }

    @PostMapping("/saving")
    private String saveBook(@RequestBody LibraryModel libraryModel){
    libraryservice.saveOrUpdate(libraryModel);
    return libraryModel.getAuthor();
    }

    @DeleteMapping("/delete/{id}")
    private LibraryModel deleteLibraryBook(@PathVariable("id")int id){
    libraryservice.delete(id);
    return libraryservice.getBookById(id);

    }
    @GetMapping("/getbook/{id}")
    private LibraryModel getbook(@PathVariable("id")int id){

    return libraryservice.getBookById(id);
    }




}
