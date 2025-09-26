package org.example;

public class Booking {

    private String id;
    private Client client;
    private Car car;
    private int days;
    private double price;
    private boolean isActive;

    public Booking(String id, Car car, int days, double price, boolean isActive) {
        this.id = id;
        this.car = car;
        this.days = days;
        this.price = price;
        this.isActive = isActive;
    }

    public Booking() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getCar(Car car) {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", car=" + car +
                ", days=" + days +
                ", price=" + price +
                ", isActive=" + isActive +
                '}';
    }
}