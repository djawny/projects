package sda.zadanie22_json_unirest;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class HolidayApiClient {

    public static void main(String[] args) throws UnirestException {
        String country = "PL";
        String year = "2016";
        String month = "01";

        JsonNode jsonNode = Unirest.get("https://holidayapi.com/v1/holidays")
                .queryString("key", "1f1c9c23-e6b1-4b71-8a06-b3fe9b176bfb")
                .queryString("country", country)
                .queryString("year", year)
                .queryString("month", month)
                .asJson()
                .getBody();
        System.out.println(jsonNode);
        String holiday = jsonNode.getObject()
                .optJSONArray("holidays")
                .getJSONObject(0)
                .optString("name");

        System.out.println(holiday);
    }
}
