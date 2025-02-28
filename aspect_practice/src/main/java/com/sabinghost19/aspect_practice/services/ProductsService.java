package com.sabinghost19.aspect_practice.services;

import com.sabinghost19.aspect_practice.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {
    List<Product> products=new ArrayList<>();

    public void AddProduct(Product product){
        this.products.add(product);
    }

    public List<Product> getProducts(){
        return this.products;
    }
}
