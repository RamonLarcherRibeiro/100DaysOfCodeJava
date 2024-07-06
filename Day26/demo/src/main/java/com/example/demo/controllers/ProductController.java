package com.example.demo.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.ProductModel;

import com.example.demo.dtos.ProductRecordDto;
import com.example.demo.repositories.ProductRepository;

import jakarta.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    ProductRepository ProductRepository;

    @PostMapping("/produtos")
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordDto productRecordDto){
        var ProductModel = new ProductModel();
        BeanUtils.copyProperties(productRecordDto, productRecordDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(ProductRepository.save(ProductModel));
        
    }
}
