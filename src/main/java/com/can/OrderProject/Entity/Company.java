package com.can.OrderProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.*;

@Data
@AllArgsConstructor
@ToString
public class Company extends BaseEntity
{

    private String companyName;
    private String sector;


    private double averagabill;
   @ToString.Exclude private Set<Bill> bills;
    @Builder
    public Company(Long id, LocalDate cratedDate, String companyName, String sector, Set<Bill> bills) {

        super(id, cratedDate);
        this.companyName = companyName;
        this.sector = sector;
        this.bills = bills;
        this.averagabill=0.0;
    }


    public double getAverageBills(){

        return bills.stream().mapToDouble(value -> value.getTotalPrice()).average().getAsDouble();

    }

}
