package sda.zadanie19_json.zad2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String json = "{\n" +
                "\n" +
                "    \"status\": 200,\n" +
                "    \"holidays\": {\n" +
                "        \"2016-01-01\": [\n" +
                "            {\n" +
                "                \"name\": \"Nowy Rok\",\n" +
                "                \"date\": \"2016-01-01\",\n" +
                "                \"observed\": \"2016-01-01\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-01-06\": [\n" +
                "            {\n" +
                "                \"name\": \"Święto Trzech Króli\",\n" +
                "                \"date\": \"2016-01-06\",\n" +
                "                \"observed\": \"2016-01-06\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-03-27\": [\n" +
                "            {\n" +
                "                \"name\": \"Niedziela Wielkanocna\",\n" +
                "                \"date\": \"2016-03-27\",\n" +
                "                \"observed\": \"2016-03-27\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-03-28\": [\n" +
                "            {\n" +
                "                \"name\": \"Poniedziałek Wielkanocny\",\n" +
                "                \"date\": \"2016-03-28\",\n" +
                "                \"observed\": \"2016-03-28\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-05-01\": [\n" +
                "            {\n" +
                "                \"name\": \"Święto Pracy\",\n" +
                "                \"date\": \"2016-05-01\",\n" +
                "                \"observed\": \"2016-05-01\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-05-03\": [\n" +
                "            {\n" +
                "                \"name\": \"Święto Narodowe Trzeciego Maja\",\n" +
                "                \"date\": \"2016-05-03\",\n" +
                "                \"observed\": \"2016-05-03\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-05-15\": [\n" +
                "            {\n" +
                "                \"name\": \"Zesłanie Ducha Świętego\",\n" +
                "                \"date\": \"2016-05-15\",\n" +
                "                \"observed\": \"2016-05-15\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-05-26\": [\n" +
                "            {\n" +
                "                \"name\": \"Dzień Bożego Ciała\",\n" +
                "                \"date\": \"2016-05-26\",\n" +
                "                \"observed\": \"2016-05-26\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-08-15\": [\n" +
                "            {\n" +
                "                \"name\": \"Wniebowzięcie Najświętszej Maryi Panny\",\n" +
                "                \"date\": \"2016-08-15\",\n" +
                "                \"observed\": \"2016-08-15\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-11-01\": [\n" +
                "            {\n" +
                "                \"name\": \"Uroczystość Wszystkich Świętych\",\n" +
                "                \"date\": \"2016-11-01\",\n" +
                "                \"observed\": \"2016-11-01\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-11-11\": [\n" +
                "            {\n" +
                "                \"name\": \"Narodowe Święto Niepodległości\",\n" +
                "                \"date\": \"2016-11-11\",\n" +
                "                \"observed\": \"2016-11-11\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-12-25\": [\n" +
                "            {\n" +
                "                \"name\": \"Pierwszy dzień Bożego Narodzenia\",\n" +
                "                \"date\": \"2016-12-25\",\n" +
                "                \"observed\": \"2016-12-25\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ],\n" +
                "        \"2016-12-26\": [\n" +
                "            {\n" +
                "                \"name\": \"Drugi dzień Bożego Narodzenia\",\n" +
                "                \"date\": \"2016-12-26\",\n" +
                "                \"observed\": \"2016-12-26\",\n" +
                "                \"public\": true\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "\n" +
                "}";

        ObjectMapper objectMapper = new ObjectMapper();
        HolidaysCalendar holidaysCalendar = objectMapper.readValue(json, HolidaysCalendar.class);

        System.out.println(holidaysCalendar);
    }
}