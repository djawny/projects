package sda.zadanie22_json_unirest;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;

public class RestCountriesPlusOpenWeatherClient {
    public static void main(String[] args) throws UnirestException {
        JsonNode response = Unirest.get("https://restcountries-v1.p.mashape.com/all")
                .header("X-Mashape-Key", "DBZFbIuWd2mshhrDzjIqyYDhzrwup1iMThBjsn0WrxveKgBHdt")
                .header("Accept", "application/json")
                .asJson().getBody();

        JSONArray responseArray = response.getArray();
        int size = responseArray.length();
        for (int i = 0; i < size; i++) {
            JSONObject jsonObject = responseArray.getJSONObject(i);
            String country = jsonObject.optString("name");
            String capital = jsonObject.optString("capital");

            JsonNode jsonNode = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
                    .queryString("q", capital)
                    .queryString("appid", "779bcb1c99f4dcd8ffe6b596d5dc919d")
                    .queryString("units", "metric")
                    .asJson()
                    .getBody();

            if (!capital.isEmpty()) {
                String temp = jsonNode
                        .getObject()
                        .optJSONObject("main")
                        .optString("temp");
                System.out.println(country + " - " + capital + ": " + temp + " C");
            }
        }
    }
}
