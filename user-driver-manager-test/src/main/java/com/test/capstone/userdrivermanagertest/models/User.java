package com.test.capstone.userdrivermanagertest.models;


import jakarta.persistence.*;


@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;
    private String role; // 'DRIVER' or 'MANAGER'


    public User() {
    }

    public User(Long userId, String username, String password, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
