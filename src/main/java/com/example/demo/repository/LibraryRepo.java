package com.example.demo.repository;

import com.example.demo.model.LibraryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LibraryRepo extends CrudRepository<LibraryModel,Integer> {

}

