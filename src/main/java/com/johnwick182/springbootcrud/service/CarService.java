package com.johnwick182.springbootcrud.service;
import com.johnwick182.springbootcrud.model.Car;
import com.johnwick182.springbootcrud.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> listAll() {
        return carRepository.findAll();
    }

    public void save(Car car) {
        carRepository.save(car);
    }

    public void getById(Integer id) {
        carRepository.findById(id);
    }

    public void delete(Integer id) {
        carRepository.deleteById(id);
    }

}
