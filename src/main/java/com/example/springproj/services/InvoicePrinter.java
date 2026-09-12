package com.example.springproj.services;

import com.example.springproj.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoicePrinter {

    public void printInvoice(List<Product> productList, double totalAmt){
        productList.forEach(i -> System.out.println(i.getName() + " : " + i.getPrice()));
             System.out.println("TotalAmount" +" : " + totalAmt);
    }
}
