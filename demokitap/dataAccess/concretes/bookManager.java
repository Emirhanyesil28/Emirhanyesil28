package com.example.demokitap.dataAccess.concretes;

import com.example.demokitap.business.requests.CreatebooksRequest;
import com.example.demokitap.business.responses.GetAllbooksResponse;
import com.example.demokitap.core.utilities.mappers.ModelMapperService;
import com.example.demokitap.dataAccess.abstracts.bookRepository;
import com.example.demokitap.dataAccess.abstracts.bookService;
import com.example.demokitap.entities.concretes.book;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class bookManager implements bookService {
    private bookRepository bookRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllbooksResponse> getAll() {

        List<book> books = bookRepository.findAll();

        List<GetAllbooksResponse> booksResponse = books.stream()
                .map(book->this.modelMapperService.forResponse()
                        .map(book,GetAllbooksResponse.class)).collect(Collectors.toList());

        return booksResponse;

    }

    @Override
    public void add(CreatebooksRequest createbooksRequest) {
        book book = this.modelMapperService.forRequest().map(createbooksRequest, book.class);

        this.bookRepository.save(book);
    }
}
