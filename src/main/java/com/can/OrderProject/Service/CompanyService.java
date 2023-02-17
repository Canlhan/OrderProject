package com.can.OrderProject.Service;

import com.can.OrderProject.Entity.Company;

import java.util.List;
import java.util.Set;

public interface CompanyService
{

    Set<Company> getAll();

    Company get(int id);

    Company add(Company company);

    Company delete(Company company);

    Set<String> getCompanysSectorNameByBills();

}
