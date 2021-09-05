package web.services;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;
import java.util.Optional;

@Component
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(Optional<Integer> count){
        if (!count.isPresent() || carDao.size() <= count.get()) {
            return carDao.getAllCars();
        } else {
            return carDao.getCars(count.get());
        }
    }

    @Override
    public void save(Car car) {
        carDao.save(car);
    }

    @Override
    public List<Car> getAllCars(){
        return carDao.getAllCars();
    }
}
