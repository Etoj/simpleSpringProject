package com.example.jobboard.postings;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostingService {

    private final PostingRepository postingRepository;

    PostingService(PostingRepository postingRepository) {
        this.postingRepository = postingRepository;
    }

    public List<Posting> getAll() {
        return null;
    }

    public Optional<Posting> getById(Long id) {
        return null;
    }

    public Posting add(Posting posting) {
        return null;
    }

    public Posting update(Long id, Posting posting) {
        return null;
    }

    public String deleteByID(Long id) {
        return null;
    }
}
