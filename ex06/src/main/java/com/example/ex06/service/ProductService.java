package com.example.ex06.service;

import com.example.ex06.entity.Member;
import com.example.ex06.entity.Product;
import com.example.ex06.repository.MemberRepository;
import com.example.ex06.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @GetMapping
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(Long id){
        return productRepository.findById(id).orElse(null);
    }
}
