package sda.zadanie22_json_unirest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

public class ApiClient {
    public static void main(String[] args) throws UnirestException, IOException {
        String response = Unirest.get("http://192.168.2.17:8080/customers/dj01").asString().getBody();
//        System.out.println(response);
//        String json = "    {\n" +
//                "        \"firstName\": \"Adam1111111\",\n" +
//                "        \"lastName\": \"Mickiewicz22222222\",\n" +
//                "        \"birthYear\": 1798,\n" +
//                "        \"height\": 1.7,\n" +
//                "        \"id\": \"sdfsdf\"\n" +
//                "    }";
//        String postResponse = Unirest.post("http://192.168.2.17:8080/customers/dj01")
//                .header("Content-Type", "application/json").body(json)
//                .asString().getBody();
//        System.out.println(postResponse);

        ObjectMapper objectMapper = new ObjectMapper();
        Person person1 = objectMapper.readValue(response, Person.class);
        System.out.println(person1);
    }
}
