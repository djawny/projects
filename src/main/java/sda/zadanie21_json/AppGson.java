package sda.zadanie21_json;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppGson {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        // ZAMIANA OBIEKTU NA JSON
        Customer customer = new Customer("Adam", "kowalski", 1980, 123);
        String stringJson = gson.toJson(customer);
        System.out.println(stringJson);

        // ZAMIANA JSONa na obiekt
        String jsonCustomer = "{\"firstName\":\"Adam\",\"lastName\":\"kowalski\",\"birthYear\":1980,\"idNumber\":123}";
        Customer customer1 = gson.fromJson(jsonCustomer, Customer.class);
        System.out.println(customer1);

        // ZAMIANA SKOMPLIKOWANEGO OBIEKTU NA JSON
        Customer customer2 = new Customer("Adam", "kowalski", 1980, 123);
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Terminator"));
        movies.add(new Movie("Matrix"));
        movies.add(new Movie("Forrest Gump"));
        Rental rental = new Rental(customer, new Date(), new Date(), movies);
        String rentalJson = gson.toJson(rental);
        System.out.println(rentalJson);

        // ZAMIANA NA JSON I ZAPIS DO PLIKU
        FileWriter fileWriter = new FileWriter("myfile.json");
        gson.toJson(customer, fileWriter);
        fileWriter.flush();
        fileWriter.close();

        // ODCZYT JSONa z pliku i zamiana na obiekt
        Customer customer3 = gson.fromJson(new FileReader("file.json"), Customer.class);
    }
}
