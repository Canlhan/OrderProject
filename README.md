# OrderProject
### Maven commands
![mavencommands](https://user-images.githubusercontent.com/57431420/219677950-bf8e0cc4-5c37-4428-8f84-766847f1c4fb.png)

### outputs
******* ALL CUSTOMERS************* \
All customers: [Customer(firstName=Hasan, lastName=ilhan, products=[Product{ productName='çanta', price=500.6}]), Customer(firstName=Can, lastName=ilhan, products=[Product{ productName='eldiven', price=1500.6}, Product{ productName='çanta', price=500.6}])] \

**********CUSTOMERS CONTAINS C character******** \
Customer(firstName=Can, lastName=ilhan, products=[Product{ productName='eldiven', price=1500.6}, Product{ productName='çanta', price=500.6}]) \

******CUSTOMERS BILLS SUM IN JUNE*********** \
sdfsdfsd: [Customer(firstName=Can, lastName=ilhan, products=[Product{ productName='eldiven', price=1500.6}, Product{ productName='çanta', price=500.6}])]
customer: Customer(firstName=Can, lastName=ilhan, products=[Product{ productName='eldiven', price=1500.6}, Product{ productName='çanta', price=500.6}]) sum of customer's Bill: 2001.1999999999998 \

*********** ALL BILLS************** \
bills: [Bill{order=Order(customerId=Customer(firstName=Hasan, lastName=ilhan, products=[Product{ productName='çanta', price=500.6}]), billId=2), customer=Customer(firstName=Hasan, lastName=ilhan, products=[Product{ productName='çanta', price=500.6}]), totalPrice=500.6, company=Company(companyName=ilhanlılar, sector=Otomotisdv, averagabill=0.0)date: 2023-06-30
} \, Bill{order=Order(customerId=Customer(firstName=Can, lastName=ilhan, products=[Product{ productName='eldiven', price=1500.6}, Product{ productName='çanta', price=500.6}]), billId=1), customer=Customer(firstName=Can, lastName=ilhan, products=[Product{ productName='eldiven', price=1500.6}, Product{ productName='çanta', price=500.6}]), totalPrice=2001.1999999999998, company=Company(companyName=teknosa, sector=teknoloji, averagabill=0.0)date: 2023-06-30
}] \

*************BILL TOTAL PRICE MORE THAN 1500********* \
bills that totalPrice more than 1500: \ [Bill{order=Order(customerId=Customer(firstName=Can, lastName=ilhan, products=[Product{ productName='eldiven', price=1500.6}, Product{ productName='çanta', price=500.6}]), billId=1), customer=Customer(firstName=Can, lastName=ilhan, products=[Product{ productName='eldiven', price=1500.6}, Product{ productName='çanta', price=500.6}]), totalPrice=2001.1999999999998, company=Company(companyName=teknosa, sector=teknoloji, averagabill=0.0)date: 2023-06-30
}] \

************** AVERAGE OF BILLS MORE THAN 1500 \
  average of totalprice of all bills: 2001.1999999999998 \

********** CUSTOMERS BILLS LESS THAN 1500 ****** \
 customer's bills more than hundred fifteen: [Customer(firstName=Hasan, lastName=ilhan, products=[Product{ productName='çanta', price=500.6}])] \

********* COMPANY'SECTOR NAME IN JUNE \
company in june: [Otomotisdv] \
