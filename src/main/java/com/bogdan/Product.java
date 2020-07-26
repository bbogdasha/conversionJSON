package com.bogdan;

public class Product {

    private String product;
    private float version;
    private String releaseDate;
    private boolean demo;
    private Person person;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isDemo() {
        return demo;
    }

    public void setDemo(boolean demo) {
        this.demo = demo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", version=" + version +
                ", releaseDate='" + releaseDate + '\'' +
                ", demo=" + demo +
                ", person=" + person +
                '}';
    }
}
