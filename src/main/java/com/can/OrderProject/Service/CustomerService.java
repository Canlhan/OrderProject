package com.can.OrderProject.Service;

import com.can.OrderProject.Entity.Bill;
import com.can.OrderProject.Entity.Customer;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface CustomerService
{
    Set<Customer> getAll();

    Customer add(Customer customer);

    Customer delete(Customer customer);

    Customer get(int id);

    Customer getFilter(String search);

    Map<Customer,Double> getCustomerBillInJune();
}
