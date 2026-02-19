package org.springboots.bootapitwice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @GetMapping("/bikes")
    public List<Bike> getAllBike() {
        return this.bikeService.getAllBike();
    }

    @GetMapping("/bikes/{name}")
    public Bike getSingleData(@PathVariable String name) {
        return this.bikeService.getSingleBikeByName(name);
    }

    @PostMapping("/bikes")
    public Bike addBike(@RequestBody Bike bike) {
        return this.bikeService.addBike(bike);
    }

    @DeleteMapping("/bikes/{name}")
    public void deleteBike(@PathVariable String name) {
        this.bikeService.deleteBike(name);
    }

    @PutMapping("/bikes")
    public Bike updateBike(@RequestBody Bike bike) {
        return this.bikeService.updateBike(bike);
    }
}