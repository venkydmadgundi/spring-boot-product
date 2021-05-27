package com.example.simple.web.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.jdbc.core.RowMapper;

import com.example.simple.web.model.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, String> {

    Page<Product> findAll(Pageable pageable);

    // Product findById(int id);

    // void save(Product product);

    // void update(Product product,int id);

    // boolean delete(int id);

    

}
