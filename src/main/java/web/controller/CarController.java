package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int allCars, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        CarServiceImp service = new CarServiceImp();

        cars.add(new Car(1, "Lada", "Black", 2016));
        cars.add(new Car(2, "BMW", "White", 2021));
        cars.add(new Car(3, "Audi", "Red", 2022));
        cars.add(new Car(4, "Ford", "Blue", 2013));
        cars.add(new Car(5, "Honda", "Silver", 2010));

        cars = service.countCars(cars, allCars);
        model.addAttribute("cars", cars);

        return "cars";
    }
}
