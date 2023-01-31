package com.example.jobboard.postings;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;
@AllArgsConstructor
@Getter
public class Posting {
    private Long id;
    private String description;
    private BigDecimal salary;
    private LocalDate expiresAt;

}
