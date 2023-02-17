package com.can.OrderProject.Service;

import com.can.OrderProject.Entity.Bill;
import com.can.OrderProject.Entity.Company;
import com.can.OrderProject.Entity.Customer;

import java.util.List;
import java.util.Set;

public interface BillService
{
    Set<Bill> getAll();

    Bill get(int id);

    Bill add(Bill  bill);

    Bill delete(Bill bill);

    List<Bill> getBillsMoreThanHundredFifteen();

    double getAverageOfAllBills();

    List<Customer> getCustomerByBillsLessThanFiveHundred();


    List<String> getCompanyInJune();

}
