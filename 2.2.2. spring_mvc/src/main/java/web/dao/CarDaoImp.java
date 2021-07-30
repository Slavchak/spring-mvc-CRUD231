package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {

    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "X6M", 2016));
        carList.add(new Car("AUDI", "RS 6", 2015));
        carList.add(new Car("Volvo", "XC 70", 2009));
        carList.add(new Car("Mercedes", "GLE", 2020));
        carList.add(new Car("Lamborghini", "Urus", 2021));
    }

    @Override
    public List<Car> getAllCar() {
        return carList;
    }

    @Override
    public List<Car> getCarByCount(Integer count) {
        return carList.subList(0, count);
    }
}
