package com.can.OrderProject.Entity;

import lombok.*;

import java.time.LocalDate;
import java.util.*;

@Data
@NoArgsConstructor
@ToString
public class Order extends BaseEntity
{







    private Customer customerId;

    private Long billId;
    @Builder
    public Order(Long id, LocalDate
            createdDate, Customer customer, Long billId) {
        super(id,createdDate);
        this.customerId = customer;
        this.billId=billId;

    }


}
