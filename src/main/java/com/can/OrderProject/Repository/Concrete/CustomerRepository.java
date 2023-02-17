package com.can.OrderProject.Repository.Concrete;

import com.can.OrderProject.Entity.Customer;

public interface CustomerRepository extends BaseRepository<Customer>
{


    Customer getCustomerBySearching(String search);

}
