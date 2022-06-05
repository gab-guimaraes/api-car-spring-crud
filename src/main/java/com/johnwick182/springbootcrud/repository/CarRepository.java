package com.johnwick182.springbootcrud.repository;

import com.johnwick182.springbootcrud.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
