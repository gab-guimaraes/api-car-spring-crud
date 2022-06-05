package com.johnwick182.springbootcrud.service;

import com.johnwick182.springbootcrud.model.Car;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.logging.Logger;

import static java.lang.System.getLogger;

@Service
public class CsvCarService {

    @Autowired
    CarService carService;

    public void writeCarsCsv(Writer writer) {
        List<Car> list = carService.listAll();
        try (CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT)) {
            for (Car car : list) {
                csvPrinter.printRecord(car.getId(), car.getBrand(), car.getModel(), car.getHp(), car.getMaxSpeed());
            }

        } catch (IOException e) {
            System.out.println(("Error While writing CSV " + e));
        }
    }
}
