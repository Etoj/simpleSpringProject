package com.example.jobboard.postings;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequestMapping("/postings")
public class PostingController {

    @GetMapping
    public String getAll() {
        return "GET - get all";
    }

    @GetMapping("/{id}")
    public Posting getByID(@PathVariable Long id) {
        return new Posting(
                id,
                "super fajna praca",
                new BigDecimal("100000"),
                LocalDate.now().plusMonths(1)
        );
    }

    @PostMapping
    public String add() {
        return "POST - ok";
    }

    @PutMapping
    public String update() {
        return "PUT - ok";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE - ok";
    }
}
