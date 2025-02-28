package com.sabinghost19.aspect_practice.controllers;

import com.sabinghost19.aspect_practice.models.Product;
import com.sabinghost19.aspect_practice.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductsController {
    private ProductsService productsService;

    @Autowired
    ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping(path = "/products")
    public String getProducts(Model page) {

        var products = this.productsService.getProducts();
        page.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping(path = "/productsPOST")
    public String addProduct(@RequestParam(required = true) String name,
                             @RequestParam(required = true) String price,
                             Model page) {
        Product product = new Product(name,price);
        this.productsService.AddProduct(product);

        var all_products = this.productsService.getProducts();
        page.addAttribute("products", all_products);

        return "postProducts.html";
    }


}