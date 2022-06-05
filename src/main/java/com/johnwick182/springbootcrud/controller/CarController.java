package com.johnwick182.springbootcrud.controller;

import com.johnwick182.springbootcrud.service.CarService;
import com.johnwick182.springbootcrud.model.Car;
import com.johnwick182.springbootcrud.service.CsvCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @Autowired
    private CsvCarService csvCarService;

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

    @GetMapping("/csv")
    public void getCsvCars(HttpServletResponse servletResponse) throws IOException {
        servletResponse.setContentType("text/csv");
        servletResponse.addHeader("Content-Disposition","attachment; filename=\"cars.csv\"");
        csvCarService.writeCarsCsv(servletResponse.getWriter());
    }



}
