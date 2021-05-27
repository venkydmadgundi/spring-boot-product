package com.example.simple.web.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletResponse;
import org.springframework.web.server.ResponseStatusException;
// import org.springframework.web.bind.annotation.ResponseStatus;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.simple.web.model.Product;
import com.example.simple.web.repository.ProductRepository;
import com.example.simple.web.controller.MyResourceNotFoundException;

@RestController
// @CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/")
public class ProductController {

    // Exception handling
    // Validations

    // Pagination - React(API send parms page =1), total number, number rows.
    // Store procedure 

    // Documentation

    @Autowired
    ProductRepository productRepository;

    @GetMapping("products/")
    public Page<Product> findAll( Pageable pageable ) {
        return productRepository.findAll(pageable);
    }

    // @GetMapping("products/{id}")
    // public Product findById(@PathVariable Integer id, HttpServletResponse response) {
    //     // return productRepository.findById(id);
    //     try {
    //         Product productById = productRepository.findById(id);
    //         return productById;
    //     }
    //     catch (MyResourceNotFoundException exc) {
    //          throw new ResponseStatusException(
    //        HttpStatus.NOT_FOUND, "Foo Not Found", exc);
    //     }
        
    // }

    // @PostMapping("products/")
    // public void save(@RequestBody Product product) {
    //     productRepository.save(product);
    // }

    // @PutMapping("products/{id}")
    // public void update(@RequestBody Product product, @PathVariable Integer id) {
    //     productRepository.update(product, id);
    // }

    // @DeleteMapping("products/{id}")
    // public boolean delete(@PathVariable Integer id) {
    //     return productRepository.delete(id);
    // }
}
