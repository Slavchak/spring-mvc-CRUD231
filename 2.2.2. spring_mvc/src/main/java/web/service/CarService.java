package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> writeCar(Integer count);

    List<Car> getAllCar();

    List<Car> getCarByCount(Integer count);
}
