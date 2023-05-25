package com.example.college.repo;

import com.example.college.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Collegerepo extends JpaRepository<College,Long> {
}
