package com.bogdan;

public class Contact {

    private String firstname;
    private String surname;
    private String phone;
    private String relationship;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", relationship='" + relationship + '\'' +
                '}';
    }
}
