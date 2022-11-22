package com.example.BasicBeans;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private String name;
    private Address address;
    private int age;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

