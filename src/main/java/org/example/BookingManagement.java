package org.example;

import java.awt.print.Book;
import java.util.Scanner;

public class BookingManagement {

    public static void MakeBooking(DataStore myDataStore) {

        System.out.println("Booking" );

    }

    public static void CreateBooking(DataStore myDataStore){
        Booking myBooking =new Booking();
        Car myCar = new Car();
        Scanner myScanner =new Scanner(System.in);
        String option;

        CarManagement.printCarList(myDataStore.getCars());
        System.out.println("Selecciona un coche: " );
        option = myScanner.nextLine();
        System.out.println("Coche seleccionado: " + option);

        //Recuperar el car con Id seleccionado
        //myDataStore.getCars().get(Integer.parseInt(option));
        myBooking.setCar(myDataStore.getCars().get(Integer.parseInt(option)));
        System.out.println("Coche del booking: " );
        CarManagement.printCar(myBooking.getCar(myDataStore.getCars().get(Integer.parseInt(option))).toString());

        //System.out.println("Numero de dias: " );
        //option = myScanner.nextLine();
        //System.out.println("Dias para booking: " + option);


    }

}
