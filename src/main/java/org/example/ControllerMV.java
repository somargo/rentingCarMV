package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerMV {

    public static void Menu(DataStore myDataStore) {

        Scanner myscanner = new Scanner(System.in); // Sirve para recoger texto por consola
        System.out.println("MENU RENTING CAR");

        label:
        while (true) {
            System.out.println("0 - Salir" + "\n");
            System.out.println("1 - Test" + "\n");
            System.out.println("2 - Lista cars" + "\n");
            System.out.println("3 - Login client" + "\n");
            System.out.println("4 - Hacer booking" + "\n");
            System.out.println("\n");
            System.out.println("Elija una opción: " );

            String option = myscanner.nextLine();

            switch (option) {
                case "0":
                    System.out.println("Has elegido Salir" );
                    break;

                case "1":
                    System.out.println("Has elegido Test" );
                    break label;

                case "2":
                    System.out.println("Has elegido Lista de Cars" );
                    break label;

                case "3":
                    System.out.println("Has elegido Login cliente" );
                    break label;

                case "4":
                    System.out.println("Has elegido Make Booking" );
                    BookingManagement.MakeBooking(myDataStore);
                    BookingManagement.CreateBooking(myDataStore);
                    break label;
                default:
                    System.out.println("Insertar solo numeros del 0 al 4");
                    break;
            }
        }
    }


}
