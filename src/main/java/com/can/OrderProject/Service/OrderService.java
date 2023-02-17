package com.can.OrderProject.Service;

import com.can.OrderProject.Entity.Order;

import java.util.Set;

public interface OrderService
{
    Set<Order> getAll();

    Order get(int id);

    Order add(Order order);
    Order delete(Order order);

}
