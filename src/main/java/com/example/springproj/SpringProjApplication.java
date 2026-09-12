package com.example.springproj;

import com.example.springproj.model.Product;
import com.example.springproj.services.ShoppingCartService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringProjApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(SpringProjApplication.class, args);
        List<Product> products=new ArrayList<>();
        products.add(new Product(1,"PS5",30000));
        products.add(new Product(2,"Carrom",3000));
        products.add(new Product(3,"Bat",300));




        ShoppingCartService service =
                context.getBean(ShoppingCartService.class);
        service.checkout(products);


    }

}
