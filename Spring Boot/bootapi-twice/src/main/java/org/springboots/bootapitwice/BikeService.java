package org.springboots.bootapitwice;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class BikeService {

    private static List<Bike> list = new ArrayList<Bike>();

    static {
        list.add(new Bike("Glamour", "Red", "Hero", 95000, 55, 2020));
        list.add(new Bike("Raider", "Yellow", "TVS", 120000, 45, 2022));
        list.add(new Bike("Ronin", "Grey", "TVS", 150000, 35, 2025));
    }

    public List<Bike> getAllBike() {
        return list;
    }

    public Bike getSingleBikeByName(String bikeName) {
        return list.stream().filter(b -> b.getBikeName().equalsIgnoreCase(bikeName)).findFirst().orElse(null);
    }

    public Bike addBike(Bike bike){
        list.add(bike);
        return bike;
    }

    public void deleteBike(String bikeName) {
        list.removeIf(bike -> bike.getBikeName().equalsIgnoreCase(bikeName));
    }

    public Bike updateBike(Bike bike){
        list.removeIf(b -> b.getBikeName().equalsIgnoreCase(bike.getBikeName()));
        list.add(bike);
        return bike;
    }
}
