/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.data;

/**
 *
 * @author Michel Eissa 
 */
public class Flight {
    private String from;
    private String to;
    private float price;
    private String date;
    private String airline;

    public Flight(String from, String to, String date, float price) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.price = price;
    }

    public Flight(String from, String to, String date, float price, String airline) {
        this.from = from;
        this.to = to;
        this.price = price;
        this.date = date;
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
    
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    

    @Override
    public String toString() {
        return "Flight{" + "from=" + from + ", to=" + to + ", date=" + date + '}';
    }
    
}
