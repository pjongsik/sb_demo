package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.TestModel;

public interface TestRepository extends CrudRepository<TestModel, Integer>  {  

}
