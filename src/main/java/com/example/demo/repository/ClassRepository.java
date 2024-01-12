package com.example.demo.repository;

import com.example.demo.model.EazyClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<EazyClass, Integer> {
    List<EazyClass> findByOrderByName();
}
