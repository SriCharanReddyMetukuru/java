package com.wipro.java.builders.director;

import com.wipro.java.builders.CarBuilder;
import com.wipro.java.builders.Builder;
import com.wipro.java.builders.CarManualBuilder;
import com.wipro.java.builders.cars.Car;
import com.wipro.java.builders.cars.Manual;
import com.wipro.java.builders.cars.CarType;
import com.wipro.java.builders.components.Engine;
import com.wipro.java.builders.components.GPSNavigator;
import com.wipro.java.builders.components.Transmission;
import com.wipro.java.builders.components.TripComputer;


public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}