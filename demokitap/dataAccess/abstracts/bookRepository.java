package com.example.demokitap.dataAccess.abstracts;

import com.example.demokitap.entities.concretes.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRepository extends JpaRepository<book,Integer> {

}
