package com.bogdan;

public class Phone {

    private String home;
    private String mobile;

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "home='" + home + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
