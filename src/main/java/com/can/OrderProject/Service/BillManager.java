package com.can.OrderProject.Service;

import com.can.OrderProject.Entity.Bill;
import com.can.OrderProject.Entity.Company;
import com.can.OrderProject.Entity.Customer;
import com.can.OrderProject.Repository.Concrete.BillRepository;
import com.can.OrderProject.Repository.Concrete.BillRepositoryImpl;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalField;
import java.util.*;
import java.util.stream.Collectors;

public class BillManager implements BillService{


    private final BillRepository billRepository;

    public BillManager() {

        this.billRepository=new BillRepositoryImpl();
    }

    @Override
    public Set<Bill> getAll() {

        return billRepository.getAll();
    }

    @Override
    public Bill get(int id) {

        return billRepository.get(id);
    }

    @Override
    public Bill add(Bill bill) {
        Date date=new Date();

        Random random = new Random();
         int month=random.ints(4, 6)
                .findFirst()
                .getAsInt();
        date.setMonth(month);

        bill.setCratedDate(LocalDate.of(2023, Month.JUNE,30));


        return billRepository.add(bill);
    }

    @Override
    public Bill delete(Bill bill) {

        return billRepository.delete(bill);
    }

    @Override
    public List<Bill> getBillsMoreThanHundredFifteen() {

        List<Bill> bills=billRepository.getAll().stream().filter(bill -> bill.getTotalPrice()>1500).collect(Collectors.toList());

        return bills;
    }

    @Override
    public double getAverageOfAllBills() {
        if(getBillsMoreThanHundredFifteen().size()>0){
            double avg=getBillsMoreThanHundredFifteen().stream().mapToDouble(value -> value.getTotalPrice()).average().getAsDouble();
            double AverageOftotalPriceOfAllBills=getBillsMoreThanHundredFifteen().stream().map(bill -> bill.getTotalPrice())
                    .reduce(0.0,Double::sum) /getBillsMoreThanHundredFifteen().size();

            return  avg;
        }
        return 0;


    }

    @Override
    public List<Customer> getCustomerByBillsLessThanFiveHundred() {
        List<Customer> customers=getAll()
                .stream()
                .filter(bill -> bill.getTotalPrice()<1500)
                .map(bill -> bill.getCustomer()).collect(Collectors.toList());

        return customers;
    }



    @Override
    public List<String> getCompanyInJune() {
        List<Bill> a=getAll().stream().filter(bill -> bill.getCratedDate().getMonth()==Month.JUNE).toList();


       // List<String> companies=a.stream().map(bill -> bill.getCompany()).map(company -> company.getSector()).collect(Collectors.toList());
        return null;
    }
}
