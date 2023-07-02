package com.luis.backend.cartapp.backendcartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.backend.cartapp.backendcartapp.services.ProductService;

import com.luis.backend.cartapp.backendcartapp.models.entities.Product;

@RestController // es un API Rest; devuelve un JSON o XML
@CrossOrigin(origins = "http://localhost:5173")
// @RequestMapping("/api") //ruta base
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products") // ruta secundaria o propia
    public List<Product> list() {
        return service.findAll();
    } 
}
