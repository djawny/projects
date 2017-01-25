package sda.zadanie19_json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

public class AppJackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // ZAMIANA OBIEKTU NA JSON
        Customer customer = new Customer("Adam", "Kowalski", 1980, 123);
        String customerJson = objectMapper.writeValueAsString(customer);
        System.out.println(customerJson);

        // ZAMIANA JSONa na obiekt
        String json = "{\n" +
                "  \"firstName\" : \"Adam\",\n" +
                "  \"lastName\" : \"Kowalski\",\n" +
                "  \"birthYear\" : 1980,\n" +
                "  \"idNumber\" : 123\n" +
                "}";
        Customer customer1 = objectMapper.readValue(json, Customer.class);

    }
}
