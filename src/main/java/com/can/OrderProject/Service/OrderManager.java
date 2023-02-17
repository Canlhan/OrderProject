package com.can.OrderProject.Service;

import com.can.OrderProject.Entity.Order;
import com.can.OrderProject.Repository.Concrete.OrderRepository;
import com.can.OrderProject.Repository.Concrete.OrderRepositoryImpl;

import java.util.Set;

public class OrderManager implements OrderService{
    private final OrderRepository orderRepository;

    public OrderManager() {
        this.orderRepository = new OrderRepositoryImpl();
    }

    @Override
    public Set<Order> getAll() {

        return orderRepository.getAll();
    }

    @Override
    public Order get(int id) {

        return orderRepository.get(id);
    }

    @Override
    public Order add(Order order) {

        return orderRepository.add(order);
    }

    @Override
    public Order delete(Order order) {

        return orderRepository.delete(order);
    }
}
