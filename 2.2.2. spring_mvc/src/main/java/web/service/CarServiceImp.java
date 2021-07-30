package web.service;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> writeCar(Integer count) {
        if (count == null || count > 5) {
            return getAllCar();
        } else {
            return getCarByCount(count);
        }
    }

    @Override
    public List<Car> getAllCar() {
        return carDao.getAllCar();
    }

    @Override
    public List<Car> getCarByCount(Integer count) {
        return carDao.getCarByCount(count);
    }
}
