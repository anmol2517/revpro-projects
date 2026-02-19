package org.springboots.bootapionce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class Carcontroller {

    @Autowired
    private Carservice cservice;

    @GetMapping("/cars")
    public List<Cardetails> getAll() {
        return cservice.getAllCars();
    }

    @GetMapping("/cars/{carName}")
    public Cardetails getCar(@PathVariable String carName) {
        return cservice.getCarByName(carName);
    }

    @PostMapping("/cars")
    public List<Cardetails> addCars(@RequestBody Cardetails car) {
        return cservice.addCars(car);
    }

    @DeleteMapping("/cars/{carName}")
    public List<Cardetails> deleteCar(@PathVariable String carName) {
        return cservice.deleteCars(carName);
    }

    @PutMapping("/cars/{carName}")
    public List<Cardetails> updateCar(@PathVariable String carName, @RequestBody Cardetails car) {
        return cservice.updateCars(carName, car);
    }

}
