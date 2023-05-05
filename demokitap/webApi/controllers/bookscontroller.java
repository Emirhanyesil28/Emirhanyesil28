package com.example.demokitap.webApi.controllers;


import com.example.demokitap.business.requests.CreatebooksRequest;
import com.example.demokitap.business.responses.GetAllbooksResponse;
import com.example.demokitap.dataAccess.abstracts.bookService;
import com.example.demokitap.entities.concretes.book;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class bookscontroller {
    private bookService bookService;



    @GetMapping()
    public List<GetAllbooksResponse> getAll() {
        return bookService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(CreatebooksRequest createbooksRequest){
        this.bookService.add(createbooksRequest);
    }




}
