package com.example.demokitap.dataAccess.abstracts;

import com.example.demokitap.business.requests.CreatebooksRequest;
import com.example.demokitap.business.responses.GetAllbooksResponse;
import com.example.demokitap.entities.concretes.book;

import java.util.List;

public interface bookService {
        List<GetAllbooksResponse> getAll();

        void add(CreatebooksRequest createbooksRequest);

}
