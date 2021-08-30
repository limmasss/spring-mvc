package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Bimer", "3", "f30"));
        cars.add(new Car("Skoda", "Octavia", "A8"));
        cars.add(new Car("Lada", "Sport", "Kakoy kuzov, tebe sporta malo?"));
    }

    @Override
    public List<Car> getAllCars(){
        return cars;
    }

    @Override
    public List<Car> getCars(int count){
        return cars.subList(0, count);
    }

    @Override
    public void save(Car car) {
        cars.add(car);
    }
}
