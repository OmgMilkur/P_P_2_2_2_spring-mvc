package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService{
    @Override
    public List<Car> countCars(List<Car> list, int number) {
        if (list == null || list.size() < number) {
            return list;
        }

        return list.stream().limit(number).collect(Collectors.toList());
    }
}
