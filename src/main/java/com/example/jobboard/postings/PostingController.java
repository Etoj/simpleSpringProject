package com.example.jobboard.postings;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postings")
public class PostingController {

    @GetMapping
    public String getAll() {
        return "GET - get all";
    }

    @GetMapping
    public String getByID(@PathVariable String id) {
        return "ok" + id;
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
