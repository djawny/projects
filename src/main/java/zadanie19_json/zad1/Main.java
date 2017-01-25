package zadanie19_json.zad1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String json = "{\n" +
                "    \"creditCards\":[\n" +
                "        {\n" +
                "            \"number\":\"123\",\n" +
                "            \"money\":\"123323\",\n" +
                "            \"currency\":\"PLN\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"number\":\"234\",\n" +
                "            \"money\":\"234323\",\n" +
                "            \"currency\":\"USD\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"owner\":{\n" +
                "        \"name\":\"Adam Kowalski\",\n" +
                "        \"city\":\"Wroclaw\"\n" +
                "    },\n" +
                "    \"id\":\"1234\"\n" +
                "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Account account = objectMapper.readValue(json, Account.class);

        System.out.println(account);
    }
}
