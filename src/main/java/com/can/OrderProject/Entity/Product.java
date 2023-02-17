package com.can.OrderProject.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseEntity
{

    private Long id;

    private String productName;

    private double price;


    @Override
    public String toString() {
        return "Product{" +

                " productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
