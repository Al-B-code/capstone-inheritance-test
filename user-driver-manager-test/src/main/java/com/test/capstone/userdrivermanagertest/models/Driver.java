package com.test.capstone.userdrivermanagertest.models;

import jakarta.persistence.*;


@Entity
//@Table(name = "drivers")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Driver extends User{


    private String methodOfTransport;
    private int capacity;


    public Driver() {
    }

    public Driver(Long userId, String username, String password, String role, String methodOfTransport, int capacity) {
        super(userId, username, password, role);
        this.methodOfTransport = methodOfTransport;
        this.capacity = capacity;
    }

    public String getMethodOfTransport() {
        return methodOfTransport;
    }

    public void setMethodOfTransport(String methodOfTransport) {
        this.methodOfTransport = methodOfTransport;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
