package com.bogdan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select operation (1 or 2): \n1. JSON to Java objects. \n2. Java objects to JSON.");
        int num = sc.nextInt();
        System.out.println("Selected " + num + " operation.");

        switch (num){
            case 1:
                Converter.JSONToObjects();
                break;
            case 2:
                List<Notebook> notebook = new ArrayList<>();
                String[] phoneOne = {"+46374673674", "+23525367423"};
                String[] phoneTwo = {"+15738302434", "+9738727642", "+8278273822"};
                notebook.add(new Notebook("Bob", "Shone", "1996-03-27", phoneOne));
                notebook.add(new Notebook("Merry", "Collins", "1987-11-12", phoneTwo));
                notebook.add(new Notebook("William", "Walles", "1997-09-13", phoneTwo));
                notebook.add(new Notebook("Melinda", "Morri", "1975-12-20", phoneOne));
                Staff staff = new Staff("NewCompany", notebook);
                Converter.objectsToJSON(staff);
                break;
            default:
                System.out.println("Entered wrong operation!");
        }
    }
}