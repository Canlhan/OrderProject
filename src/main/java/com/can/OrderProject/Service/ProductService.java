package com.can.OrderProject.Service;

import com.can.OrderProject.Entity.Product;

import java.util.Set;

public interface ProductService
{

    Set<Product> getAll();

    Product get(int id);
    Product add(Product product);

    Product delete(Product product);

}
