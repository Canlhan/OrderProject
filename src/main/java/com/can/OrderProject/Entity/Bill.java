package com.can.OrderProject.Entity;

import com.can.OrderProject.Entity.Order;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor

public class Bill extends BaseEntity
{



    private Order order;



    private Customer customer;

    private double totalPrice;

    private Company company;


    @Builder
    public Bill(Long id, Order order, Customer customer, LocalDate cratedDate, double totalPrice,
                Company company) {
        super(id,cratedDate);
        this.order = order;
        this.company=company;
        this.customer = customer;
        this.totalPrice=totalPrice;


    }


    @Override
    public String toString() {
        return "Bill{" +
                "order=" + order +
                ", customer=" + customer +
                ", totalPrice=" + totalPrice +
                ", company=" + company +
                "date: "+super.getCratedDate()+
                "\n}";
    }
}
