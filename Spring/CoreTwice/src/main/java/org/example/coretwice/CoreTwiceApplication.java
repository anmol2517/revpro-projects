package org.example.coretwice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoreTwiceApplication {
    public static void main(String[] args) {

        // Loads the beans.xml file and starts the Spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Gets the 'myCar' bean object from the Spring container
        Cars myCar = (Cars) context.getBean("myCar");

        System.out.println("--- Car Collection | Owner Details ---\n");

        // Loops through the owner list to print their details
        for (int i = 0; i < myCar.getOwners().size(); i++) {

            // Gets the owner name from the list
            String owner = myCar.getOwners().get(i);

            // Gets the car name for this owner from the map
            String car = myCar.getCardetails().get(owner);

            // Gets the engine info for this car from the map
            String engine = myCar.getEngineDetails().get(car);

            // Gets the mileage info for this car from the map
            String mileage = myCar.getCarMileage().get(car);

            System.out.println("Owner " + (i + 1) + " : " + owner);
            System.out.println("Car     : " + car);
            System.out.println("Engine  : " + engine);
            System.out.println("Mileage : " + mileage);
            System.out.println("------------------------------");
        }
    }
}

