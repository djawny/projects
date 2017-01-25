package sda.zadanie20_json_cdn;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ApiClient {
    public static void main(String[] args) throws UnirestException {
        String response = Unirest.get("http://192.168.2.17:8080/customers/").asString().getBody();
        System.out.println(response);

    }
}
