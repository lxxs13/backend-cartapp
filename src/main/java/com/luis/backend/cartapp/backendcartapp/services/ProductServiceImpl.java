package com.luis.backend.cartapp.backendcartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luis.backend.cartapp.backendcartapp.models.entities.Product;
import com.luis.backend.cartapp.backendcartapp.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired //inyectar
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true) //cuando son consulta solo lectura por cuetiones de JPA
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }
    
}
