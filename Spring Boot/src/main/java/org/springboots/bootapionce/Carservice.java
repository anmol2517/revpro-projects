package org.springboots.bootapionce;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class Carservice {

    private static List<Cardetails> list = new ArrayList<>();

    static {
        list.add(new Cardetails("Endeavour", "Ford", "Black", 11, 1800000));
        list.add(new Cardetails("XUV700", "Mahindra", "White", 14, 2100000));
        list.add(new Cardetails("Harrier", "Tata", "Brown", 17, 2300000));
    }

    public List<Cardetails> getAllCars() {
        return list;
    }

    public Cardetails getCarByName(String carName) {
        return list.stream().filter(c -> c.getCarName().equalsIgnoreCase(carName)).findFirst().orElse(null);
    }

    public List<Cardetails> addCars(Cardetails car) {
        list.add(car);
        return list;
    }

    public List<Cardetails> deleteCars(String carName) {
        list.removeIf(c -> c.getCarName().equalsIgnoreCase(carName));
        return list;
    }


    public List<Cardetails> updateCars(String carName, Cardetails newCar) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCarName().equalsIgnoreCase(carName)) {
                list.set(i, newCar);
                break;
            }
        }
        return list;
    }

}

