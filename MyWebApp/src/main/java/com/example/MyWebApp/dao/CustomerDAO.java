package com.example.MyWebApp.dao;

import com.example.MyWebApp.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends CrudRepository<Customer,Integer> {

}
