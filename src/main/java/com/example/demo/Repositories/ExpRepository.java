package com.example.demo.Repositories;

import com.example.demo.Models.Experience;
import org.springframework.data.repository.CrudRepository;

public interface ExpRepository extends CrudRepository<Experience, Long> {
}
