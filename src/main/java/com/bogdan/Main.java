package com.bogdan;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    private static final String filePath = "UserProduct.json";

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            Product product = mapper.readValue(new File(filePath), Product.class);
            String prettyJSON = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(product);
            System.out.println(prettyJSON);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
