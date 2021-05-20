package com.example.product.service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional

public class ProductService {
	@Autowired
    private ProductRepository productRepository;
    public List<Product> listAllProduct() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
    	productRepository.save(product);
    }

    public Product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }

    public void deleteProduct(Integer id) {
    	productRepository.deleteById(id);
    }

}
