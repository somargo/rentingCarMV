package org.example;

public class Client {

    // atributos
        private String id;
        private String name;
        private String lastName;
        private String address;
        private String email;
        private boolean premium;
        private int age;

        // constructor
        public Client(String id, String name, String lastName, String address, String email, boolean premium, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.premium = premium;
        this.age = age;
    }

    public Client(){}

    // metodos
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", premium=" + premium +
                ", age=" + age +
                '}';
    }
}
