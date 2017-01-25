package sda.zadanie20_json_cdn;

import com.mashape.unirest.http.Unirest;

public class ApiClient {
    public static void main(String[] args) {
        Unirest.get("http://192.168.2.17:8080/customers/");

    }
}
