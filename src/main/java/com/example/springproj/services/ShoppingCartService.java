package com.example.springproj.services;

import com.example.springproj.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCart shoppingCart;

    @Autowired
    private InvoicePrinter invoicePrinter;

    @Autowired
    private CartDBSaver cartDBSave;

    public void checkout(List<Product> productList){

        double totalAmt = shoppingCart.calculateTotalAmt(productList);
        invoicePrinter.printInvoice(productList,totalAmt);
        cartDBSave.saveToDB(productList);


    }
}
