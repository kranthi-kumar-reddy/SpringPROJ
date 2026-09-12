package com.example.springproj.services;

import com.example.springproj.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartDBSaver {

    public void saveToDB(List<Product> productList){
        System.out.println("Saving to SQL DB");
    }
}
