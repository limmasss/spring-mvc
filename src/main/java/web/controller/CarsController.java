package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.models.Car;
import web.services.CarService;

import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping
    public String index(@RequestParam(value = "count", required = false) Optional<Integer> count, ModelMap model){
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }

    @GetMapping("/new")
    public String newCar(ModelMap model){
        model.addAttribute("car", new Car());
        return "cars/new";
    }

    @PostMapping
    public String create(@ModelAttribute("car") Car car){
        carService.save(car);
        return "redirect:/cars";
    }
}
