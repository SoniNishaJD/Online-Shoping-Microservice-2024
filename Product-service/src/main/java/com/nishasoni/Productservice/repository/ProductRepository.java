package com.nishasoni.Productservice.repository;

import com.nishasoni.Productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
