package org.example;

public class App
{
    public static void main( String[] args )
    {
        //RentingCarTests.myDataStoreTest();
        System.out.println( "RENTING CAR WEB" );

        //Crear lista de fakers cars
        DataStore myDataStore = new DataStore();
        FakerDataBBDDPopulate.populateBBDDByCar(myDataStore);
        // mostrar faker
        //FakerDataBBDDPopulate.mostrarFakerListCar(myDataStore);
        FakerDataBBDDPopulate.populateBBDDByBooking(myDataStore);


        ControllerMV.Menu(myDataStore);


         //ControllerMV.Menu();



    }
}
