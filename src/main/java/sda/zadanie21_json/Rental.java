package sda.zadanie21_json;

import java.util.Date;
import java.util.List;


public class Rental {
    private Customer customer;
    private Date startDate;
    private Date endDate;
    List<Movie> movies;

    public Rental() {
    }

    public Rental(Customer customer, Date startDate, Date endDate, List<Movie> movies) {
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "customer=" + customer +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
