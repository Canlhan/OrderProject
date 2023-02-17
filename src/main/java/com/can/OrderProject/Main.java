package com.can.OrderProject;


import com.can.OrderProject.Entity.*;
import com.can.OrderProject.Service.*;
import org.aspectj.weaver.ast.Or;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Main
{
    static CustomerService customerService=new CustomerManager();
    static OrderService orderService=new OrderManager();
    static CompanyService companyService=new CompanyManager();
    static BillService billService=new BillManager();
    public static void main(String[] args) {






        createObjects();
        System.out.println("******* ALL CUSTOMERS*************");
        System.out.println("All customers: "+customerService.getAll()+"\n");

        System.out.println("**********CUSTOMERS CONTAINS C character********");
        System.out.println(customerService.getFilter("C")+"\n");

        System.out.println("******CUSTOMERS BILLS SUM IN JUNE***********");
        customerService.getCustomerBillInJune().forEach((customer, sumOfBill) ->
                System.out.println("customer: "+customer+" sum of customer's Bill: "+sumOfBill));
        System.out.println("");
        System.out.println("*********** ALL BILLS**************");
        System.out.println("bills: "+billService.getAll()+"\n");

        System.out.println("*************BILL TOTAL PRICE MORE THAN 1500*********");
        System.out.println("bills that totalPrice more than 1500: "+billService.getBillsMoreThanHundredFifteen()+"\n");


        System.out.println("************** AVERAGE OF BILLS MORE THAN 1500");
      System.out.println("  average of totalprice of all bills: "+billService.getAverageOfAllBills()+"\n");


        System.out.println("********** CUSTOMERS BILLS LESS THAN 1500 ******");
       System.out.println(" customer's bills more than hundred fifteen: "+billService.getCustomerByBillsLessThanFiveHundred()+"\n");


        System.out.println("********* COMPANY'SECTOR NAME IN JUNE");
        System.out.println("company in june: "+companyService.getCompanysSectorNameByBills()+"\n");





    }

    public static void createObjects(){

        Company company=Company.builder().id(1L).companyName("ilhanlılar")
                .sector("Otomotisdv").build();
        Company teknosa=Company.builder().id(2L).companyName("teknosa")
                .sector("teknoloji").build();
        companyService.add(company);
        companyService.add(teknosa);


        Product glory=Product.builder().id(1L).productName("eldiven").price(1500.6).build();
        Product bag=Product.builder().id(2L).productName("çanta").price(500.6).build();

        Customer can=Customer.builder().id(1L).createdDate(LocalDate.of(2023, Month.JUNE,30)).firstName("Can")
                .lastName("ilhan").products(Arrays.asList(glory,bag)).build();

        Customer hasan=Customer.builder().id(2L).createdDate(LocalDate.of(2023, Month.MARCH,30)).firstName("Hasan")
                .lastName("ilhan").products(Arrays.asList(bag)).build();

        customerService.add(can);
        customerService.add(hasan);

        Order order= Order.builder().customer(can).id(1L).billId(1L).createdDate(LocalDate.now()).build();
        Order hasanorder= Order.builder().customer(hasan).id(2L).billId(2L).createdDate(LocalDate.now()).build();

        orderService.add(hasanorder);
        orderService.add(order);




        Bill canbill=Bill.builder().totalPrice(order.getCustomerId().getProducts().stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum)).company(teknosa).customer(can).order(order).id(1L).build();

        Bill hasanbill=Bill.builder().totalPrice(hasanorder.getCustomerId().getProducts().stream()
                        .map(Product::getPrice)
                        .reduce(0.0, Double::sum))
                .company(company).customer(hasan).id(2L).order(hasanorder).build();

        billService.add(canbill);
        billService.add(hasanbill);


        can.setBills(Set.of(canbill));
        hasan.setBills(Set.of(hasanbill));

        company.setBills(Set.of(canbill));
        teknosa.setBills(Set.of(hasanbill));

    }
}
