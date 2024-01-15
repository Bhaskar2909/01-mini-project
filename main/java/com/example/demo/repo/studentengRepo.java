package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Studentenq;

public interface studentengRepo extends JpaRepository<Studentenq, Integer> {

}
