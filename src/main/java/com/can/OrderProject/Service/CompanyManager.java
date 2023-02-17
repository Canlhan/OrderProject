package com.can.OrderProject.Service;

import com.can.OrderProject.Entity.Bill;
import com.can.OrderProject.Entity.Company;
import com.can.OrderProject.Repository.Concrete.CompanyRepository;
import com.can.OrderProject.Repository.Concrete.CompanyRepositoryImpl;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.spi.CalendarDataProvider;
import java.util.stream.Collectors;

@Service
public class CompanyManager implements CompanyService
{
    private final CompanyRepository companyRepository;

    public CompanyManager() {
        this.companyRepository = new CompanyRepositoryImpl();
    }

    @Override
    public Set<Company> getAll() {

        return companyRepository.getAll();
    }

    @Override
    public Company get(int id) {

        return companyRepository.get(id);
    }

    @Override
    public Company add(Company company) {




        //company.setCratedDate();
        return companyRepository.add(company);
    }

    @Override
    public Company delete(Company company) {

        return companyRepository.delete(company);
    }

    @Override
    public Set<String> getCompanysSectorNameByBills() {




       Set<String> sectorNames=getAll().stream()
               .flatMap(s ->
                               (s.getBills().stream().filter(bill -> bill.getCratedDate().getMonth()== Month.JUNE
                        && s.getAverageBills()<750)
                                       .map(bill -> bill.getCompany().getSector())
                       )


//                       s.getCompanies()
//                               .stream()
//                               .filter(c ->
//                                       c.getAverageInvoice().compareTo(amount) == LESS
//                               )
//                               .map(c -> c.getSector())
               )
               .collect(Collectors.toSet());









//        List<Company> companyBillsInJune=getAll().stream()
//                .filter(company ->
//                        company.getBills().stream().map(bill -> bill.getTotalPrice())
//

/*
        List<Bill> bills=getAll().stream().map(company -> company.getBills()).findFirst().get().stream().toList();

        List<Bill> a=bills.stream().filter(bill -> bill.getCratedDate().getMonth()==5).toList();


        //List<Company> companies=a.stream().map(bill -> bill.getCompany()).collect(Collectors.toList());
*/

        return sectorNames;
    }
}
