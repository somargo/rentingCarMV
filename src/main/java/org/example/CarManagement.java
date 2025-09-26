package org.example;

import java.util.List;

public class CarManagement {

    public static void printCarList(List<Car> cars) {

        System.out.println("Cars from DB: ");
        System.out.println("-------------------------");
        System.out.println("Size DB: " + cars.size());

        for (Car car : cars) {
            System.out.println("\t" + car);
        }

        System.out.println("\n");
    }

    public static void printCar(String car){
        System.out.println("Car ");
        System.out.println("\t" + car);
    }

    // Paso posicion en lista devuelve id de car
    public static String findCarInList(List<Car> cars, int position){
        for (Car car : cars){
            if (position == cars.get(car.position)) {
                return cars.get(position).getId();
            }
            else {
                continue;
            }
        }
        return null;
    }
}