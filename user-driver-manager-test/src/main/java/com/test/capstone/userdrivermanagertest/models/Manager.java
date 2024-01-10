package com.test.capstone.userdrivermanagertest.models;

import jakarta.persistence.*;

@Entity
//@Table(name = "managers")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Manager extends User{



    private String managerProperty;

    public Manager() {
    }

    public Manager(Long userId, String username, String password, String role, String managerProperty) {
        super(userId, username, password, role);
        this.managerProperty = managerProperty;
    }

    public String getManagerProperty() {
        return managerProperty;
    }

    public void setManagerProperty(String managerProperty) {
        this.managerProperty = managerProperty;
    }


}
