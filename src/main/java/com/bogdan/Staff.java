package com.bogdan;

import java.util.List;

public class Staff {

    private String company;
    private List<Notebook> staff;

    public Staff(String company, List<Notebook> list) {
        this.company = company;
        this.staff = list;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Notebook> getStaff() {
        return staff;
    }

    public void setStaff(List<Notebook> staff) {
        this.staff = staff;
    }
}
