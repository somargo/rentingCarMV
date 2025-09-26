package org.example;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;


public class FakerDataBBDDPopulate {

    public static void populateBBDDByCar(DataStore myDataStore)
    {
        Faker faker = new Faker();
        int i;
        for(i = 0; i < 100; i++) {

            Car mycar = new Car();
            mycar.setId( String.valueOf (faker.number().randomNumber() ));
            mycar.setBrand(faker.space().constellation());     // marca
            mycar.setModel(faker.space().planet());            // modelo
            mycar.setPlate(faker.phoneNumber().phoneNumber()); // matricula
            mycar.setYear(faker.number().numberBetween(1980,2025));
            mycar.setPrice(faker.number().randomDouble(2, (long) 20.31, (long) 80.15));

            //add lista de coches
            myDataStore.getCars().add(mycar);
        }
    }

    public static void mostrarFakerListCar(DataStore myDataStore)
    {
        for (Car car : myDataStore.getCars()){
            System.out.println("\t " + car);    // tabulador
        }
        System.out.println("\n");       // salto de carro
    }

    public static void populateBBDDByClient(DataStore myDataStore)
        {
            Faker faker = new Faker();
            int i;
            for(i = 0; i < 100; i++) {

                Client myclient = new Client();
                //fake aleatori: id,                //asignar fake a car
                myclient.setId( String.valueOf (faker.number().randomNumber() ));
                myclient.setName(faker.name().name());
                myclient.setLastName(faker.name().lastName());
                myclient.setAddress(faker.address().fullAddress());
                myclient.setEmail(faker.internet().emailAddress());
                myclient.setPremium(faker.random().nextBoolean());
                myclient.setAge(faker.number().numberBetween(15,80));

                //add lista de clientes
                myDataStore.getClients().add(myclient);
            }
        }
    public static void mostrarFakerListClient(DataStore myDataStore)
    {
        for (Client client : myDataStore.getClients()){
            System.out.println("\t " + client);
        }
        System.out.println("\n");
    }

    public static void populateBBDDByBooking(DataStore myDataStore){

        Booking booking = new Booking();
        Faker faker = new Faker();

        for(int i = 0; i < 5; i++) {
            Car mycar = new Car();
            Client myclient = new Client();

            booking.setId(String.valueOf(i+1));

            mycar = myDataStore.getCars().get(i+1);
            booking.setCar(mycar);

            //myclient = myDataStore.getClients().get(i+1);
            //booking.setClient(myclient);

            booking.setDays(faker.number().numberBetween(1,50) );
            booking.setPrice(faker.number().randomDouble(2,10, 30));
            //booking.setPrice(faker.number().randomDouble(2, 10.31, 30.22));
            booking.setActive(true);
        }

    }
}
