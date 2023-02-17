package com.can.OrderProject.Service;

import com.can.OrderProject.Entity.Bill;
import com.can.OrderProject.Entity.Customer;
import com.can.OrderProject.Repository.Concrete.CustomerRepository;
import com.can.OrderProject.Repository.Concrete.CustomerRepositoryImpl;

import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class CustomerManager implements CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerManager() {
        this.customerRepository = new CustomerRepositoryImpl();
    }

    @Override
    public Set<Customer> getAll() {

        return customerRepository.getAll();
    }

    @Override
    public Customer add(Customer customer) {

        return customerRepository.add(customer);
    }

    @Override
    public Customer delete(Customer customer) {

        return customerRepository.delete(customer);
    }

    @Override
    public Customer get(int id) {

        return customerRepository.get(id);
    }

    @Override
    public Customer getFilter(String search) {
        Customer customer=customerRepository.getAll().stream().filter(customer1 -> customer1.getFirstName().contains(search))
                .findFirst().get();
        return customer;
    }

    @Override
    public Map<Customer,Double> getCustomerBillInJune() {
        List<Customer> customerBillInJune=getAll().stream()
                .filter(customer -> customer.getCratedDate().getMonth()== Month.JUNE)
                .collect(Collectors.toList());


        System.out.println("sdfsdfsd: "+customerBillInJune);
        return mappedCustomersAndTheirBills(customerBillInJune);
    }

    private Map<Customer,Double> mappedCustomersAndTheirBills(List<Customer> customerBillInJune){

        Map<Customer,Double> customerAndItsBills=new HashMap<>();
        customerBillInJune.stream().forEach(customer -> customerAndItsBills.put(customer,customer.getSumOfBills()));
        return customerAndItsBills;
    }


}
