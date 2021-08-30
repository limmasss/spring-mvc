package web.services;

import web.models.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> getAllCars();

    List<Car> getCars(Optional<Integer> count);

    void save(Car car);
}
