package com.can.OrderProject.Service;

import com.can.OrderProject.Entity.Product;
import com.can.OrderProject.Repository.Concrete.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProductManager implements ProductService{


    private final ProductRepository productRepository;

    public ProductManager(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public Set<Product> getAll() {

        return productRepository.getAll();
    }

    @Override
    public Product get(int id) {

        return productRepository.get(id);
    }

    @Override
    public Product add(Product product) {

        return productRepository.add(product);
    }

    @Override
    public Product delete(Product product) {

        return productRepository.delete(product);
    }
}
