package sda.zadanie19_json.zad2;

import java.util.List;
import java.util.Map;

public class HolidaysCalendar {
    private int status;
    private Map<String, List<Holiday>> holidays;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Map<String, List<Holiday>> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<String, List<Holiday>> holidays) {
        this.holidays = holidays;
    }

    @Override
    public String toString() {
        return "HolidaysCalendar{" +
                "status=" + status +
                ", holidays=" + holidays +
                '}';
    }
}
