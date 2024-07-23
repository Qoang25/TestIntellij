package com.example.lab5.repository;

import com.example.lab5.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepository extends JpaRepository <Car, Integer> {

}
