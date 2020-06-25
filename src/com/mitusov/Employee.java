package com.mitusov;

public final class Employee {
    private final String name;
    private final String lastName;
    private final Integer id;
    private final Address address;

    public Employee(String name, String lastName, Integer id, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getId() {
        return id;
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
