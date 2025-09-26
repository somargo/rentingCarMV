package org.example;

// atributos
public class Car {
    private String id;
    private String brand; // marca
    private String model; // modelo
    private String plate; // matricula
    private int year;
    private double price;


// constructors
public Car(String id, String brand, String model, String plate, int year, double price) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.plate = plate;
    this.year = year;
    this.price = price;

}

    public Car() {};

// metodos
public Car(String id) {
    this.id = id;
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int carAge() {
        return 2025 - year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", marca='" + brand + '\'' +
                ", modelo='" + model + '\'' +
                ", matricula='" + plate + '\'' +
                ", año matriculacion=" + year +
                ", precio por dia=" + price +
                '}';
    }
}