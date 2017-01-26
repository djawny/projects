package sda.zadanie22_json_unirest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OpenWeatherMapClient {
    public static void main(String[] args) throws UnirestException {
        Unirest.setObjectMapper(new ObjectMapper() {
            private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                    = new com.fasterxml.jackson.databind.ObjectMapper();

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });

//        System.out.println("Podaj nazwe miasta");
//        String city = new Scanner(System.in).nextLine();
//
//        String response = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
//                .queryString("q", city + ",pl")
//                .queryString("appid", "779bcb1c99f4dcd8ffe6b596d5dc919d")
//                .asString()
//                .getBody();
//
//        System.out.println(response);

//        Weather weather = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
//                .queryString("q", city + ",pl")
//                .queryString("appid", "779bcb1c99f4dcd8ffe6b596d5dc919d")
//                .asObject(Weather.class)
//                .getBody();
//        System.out.println(weather);

//        String cityExample = "Wroclaw";
//
//        JsonNode jsonNode = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
//                .queryString("q", cityExample)
//                .queryString("appid", "779bcb1c99f4dcd8ffe6b596d5dc919d")
//                .asJson()
//                .getBody();
//
//        String temp = jsonNode.getObject()
//                .optJSONObject("main")
//                .optString("temp");
//        System.out.println(temp);
//
//        String description = jsonNode.getObject()
//                .optJSONArray("weather")
//                .getJSONObject(0)
//                .optString("description");
//        System.out.println(description);

        Map<String, String> descriptionMap = new HashMap<>();
        descriptionMap.put("clear sky", "bezchmurnie");

        double lat = 35;
        double lon = 139;

        JsonNode jsonNode = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
                .queryString("lat", lat)
                .queryString("lon", lon)
                .queryString("appid", "779bcb1c99f4dcd8ffe6b596d5dc919d")
                .asJson()
                .getBody();

        String temp = jsonNode.getObject()
                .optJSONObject("main")
                .optString("temp");
        double tempInCel = Double.parseDouble(temp) - 273.15;
        System.out.printf("%.2f%n", tempInCel);

        String description = jsonNode.getObject()
                .optJSONArray("weather")
                .getJSONObject(0)
                .optString("description");
        System.out.println(descriptionMap.get(description));

    }
}
