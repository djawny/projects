package sda.zadanie22_json_unirest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private Coordinates coord;

    public Coordinates getCoord() {
        return coord;
    }

    public void setCoord(Coordinates coord) {
        this.coord = coord;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "coord=" + coord +
                '}';
    }
}
