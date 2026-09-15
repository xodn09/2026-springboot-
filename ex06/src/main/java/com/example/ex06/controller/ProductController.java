package com.example.ex06.controller;


import com.example.ex06.entity.Member;
import com.example.ex06.entity.Product;
import com.example.ex06.service.MemberService;
import com.example.ex06.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.getProduct(id);
    }
}
