package com.can.OrderProject.Entity;

import lombok.*;

import java.time.LocalDate;
import java.util.*;




@Getter
@Setter
@NoArgsConstructor
@ToString
public class Customer extends BaseEntity
{



    private String firstName;

    private String lastName;

    @ToString.Exclude private Set<Bill> bills;
    private List<Product> products=new ArrayList<>();


    @Builder
    public Customer(Long id, String firstName, String lastName, LocalDate createdDate, Set<Bill> bills, List<Product> products
                   ) {
        super(id,createdDate);
        this.firstName = firstName;
        this.lastName = lastName;
        this.bills=bills;
        this.products=products;

    }

    public double getSumOfBills(){

        return bills.stream().mapToDouble(value -> value.getTotalPrice()).sum();
    }

}
