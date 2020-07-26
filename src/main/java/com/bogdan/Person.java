package com.bogdan;

import java.util.Arrays;
import java.util.List;

public class Person {

    private int id;
    private String firstname;
    private String surname;
    private Phone phones;
    private String[] email;
    private String dateOfBirth;
    private boolean registered;
    private List<Contact> emergencyContacts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Phone getPhones() {
        return phones;
    }

    public void setPhones(Phone phones) {
        this.phones = phones;
    }

    public String[] getEmail() {
        return email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public List<Contact> getEmergencyContacts() {
        return emergencyContacts;
    }

    public void setEmergencyContacts(List<Contact> emergencyContacts) {
        this.emergencyContacts = emergencyContacts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + phones +
                ", email=" + Arrays.toString(email) +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", registered=" + registered +
                ", emergencyContacts=" + emergencyContacts +
                '}';
    }
}
