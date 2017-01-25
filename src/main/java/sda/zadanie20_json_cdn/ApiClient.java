package sda.zadanie20_json_cdn;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

public class ApiClient {
    public static void main(String[] args) throws UnirestException, IOException {
        String response = Unirest.get("http://192.168.2.17:8080/customers/").asString().getBody();
        System.out.println(response);


    }
}
