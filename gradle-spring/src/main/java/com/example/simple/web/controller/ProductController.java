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

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Optional;


import com.example.simple.web.model.Product;
import com.example.simple.web.repository.ProductRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
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
    @ResponseBody
    public List<Product> listAll(@RequestParam(value= "page", defaultValue = "0") Integer page, @RequestParam(value= "size", defaultValue = "10") Integer size) {

            System.out.println( page);
            System.out.println( size);
        
        return productRepository.findAll(page, size);
    }

    @GetMapping("products/{id}")
    public Product findById(@PathVariable Integer id) {
        return productRepository.findById(id);
    }

    @PostMapping("products/")
    public void save(@RequestBody Product product) {
        productRepository.save(product);
    }

    @PutMapping("products/{id}")
    public void update(@RequestBody Product product, @PathVariable Integer id) {
        productRepository.update(product, id);
    }

    @DeleteMapping("products/{id}")
    public boolean delete(@PathVariable Integer id) {
        return productRepository.delete(id);
    }
}
