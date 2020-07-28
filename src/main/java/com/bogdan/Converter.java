package com.bogdan;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Converter {

    private static final String filePathOne = "Json to objects.json";
    private static final String filePathTwo = "Objects to json.json";
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

    public static void JSONToObjects() {
        try {
            Product product = mapper.readValue(new File(filePathOne), Product.class);
            String prettyJSON = writer.writeValueAsString(product);
            System.out.println(prettyJSON);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void objectsToJSON(Staff staff) {
        try {
            writer.writeValue(new File(filePathTwo), staff);
            System.out.println("JSON created!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
