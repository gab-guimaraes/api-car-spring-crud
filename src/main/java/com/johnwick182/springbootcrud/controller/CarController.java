package com.johnwick182.springbootcrud.controller;

import com.johnwick182.springbootcrud.CarService;
import com.johnwick182.springbootcrud.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/exemplo")
    public Car getExemplo() {
        return new Car(1,"lancer",  "mitsubishi", 375, 250);
    }

    @GetMapping("/")
    public List<Car> getCars() {
        return carService.listAll();
    }

    @PostMapping
    public void add(@RequestBody Car car) {
        carService.save(car);
    }



}
