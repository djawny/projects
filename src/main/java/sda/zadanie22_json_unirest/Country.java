package sda.zadanie22_json_unirest;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.ArrayList;
import java.util.List;

public class Country {
    public static void main(String[] args) throws UnirestException {
        JsonNode response = Unirest.get("https://restcountries-v1.p.mashape.com/all")
                .header("X-Mashape-Key", "DBZFbIuWd2mshhrDzjIqyYDhzrwup1iMThBjsn0WrxveKgBHdt")
                .header("Accept", "application/json")
                .asJson().getBody();

        List<String> capitals = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            String capital = response
                    .getArray()
                    .getJSONObject(i)
                    .optString("capital");
            capitals.add(capital);
        }

        for (String capital : capitals) {
            JsonNode jsonNode = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
                    .queryString("q", capital)
                    .queryString("appid", "779bcb1c99f4dcd8ffe6b596d5dc919d")
                    .queryString("units", "metric")
                    .asJson()
                    .getBody();

            String temp = jsonNode.getObject()
                    .optJSONObject("main")
                    .optString("temp");
            System.out.println(capital + ": " + temp);
        }
    }
}
