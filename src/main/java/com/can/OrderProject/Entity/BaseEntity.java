package com.can.OrderProject.Entity;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class BaseEntity
{

    private Long id;

    private LocalDate cratedDate;
}
