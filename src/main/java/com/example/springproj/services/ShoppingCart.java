package com.example.springproj.services;

import com.example.springproj.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCart {

    public double calculateTotalAmt(List<Product> productList){
        return productList.stream().mapToDouble(p->p.getPrice()).sum();
    }
}
