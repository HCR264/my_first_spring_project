package com.trainibit.example;

import java.util.Date;

public class User {
    private String name;
    private String lastName;
    private Date birthDate;

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public Date getBirthDate() {
        return birthDate;
    }
}
