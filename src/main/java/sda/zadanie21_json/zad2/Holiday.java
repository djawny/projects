package sda.zadanie21_json.zad2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Holiday {
    private String name;
    //    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
//    private Date date;
    private String date;
    //    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
//    private Date observed;
    private String observed;
    @JsonProperty("public")
    private Boolean isPublic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getObserved() {
        return observed;
    }

    public void setObserved(String observed) {
        this.observed = observed;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", observed=" + observed +
                ", isPublic=" + isPublic +
                '}';
    }
}
