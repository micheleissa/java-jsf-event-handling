/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.managedbeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;
import lab9.data.Flight;

/**
 *
 * @author Michel Eissa
 */
@ManagedBean
@RequestScoped
public class TicketMB {

//    private List<Airline> airlines = new ArrayList<Airline>();
    private List<String> airlines = new ArrayList<String>();
    private List<Flight> selectedFlights;
    private String selectedAirline;

    /**
     * Creates a new instance of TicketMB
     */
    public TicketMB() {
        this.airlines.add("All");
        this.airlines.add("KLM");
        this.airlines.add("UnitedAirlines");
        this.airlines.add("NorthWest");
//        List<Flight> flights = new ArrayList<Flight>();
//        flights.add(new Flight("Amsterdam", "New York", "12/11/06", 790.80f));
//        flights.add(new Flight("Amsterdam", "New York", "12/11/06", 820.00f));
//        flights.add(new Flight("Amsterdam", "New York", "12/11/06", 989.00f));
        //this.airlines.add(new Airline("KLM",flights));
//        flights.clear();
//        flights.add(new Flight("Amsterdam", "New York", "12/11/06", 795.55f));
//        flights.add(new Flight("Amsterdam", "New York", "12/11/06", 875.00f));
        //this.airlines.add(new Airline("NorthWest",flights));
//        flights.clear();
//        flights.add(new Flight("Amsterdam", "New York", "12/11/06", 825.50f));
//        flights.add(new Flight("Amsterdam", "New York", "12/11/06", 1050.00f));
        //this.airlines.add(new Airline("United Airlines",flights));
    }

//    public List<Airline> getAirlines() {
//        return airlines;
//    }
    public List<String> getAirlines() {
        return airlines;
    }

    public List<Flight> getSelectedFlights() {
        return selectedFlights;
    }

    public void setSelectedFlights(List<Flight> selectedFlights) {
        this.selectedFlights = selectedFlights;
    }

    public void airlinesChanged(ValueChangeEvent event) {
//        Airline line = (Airline)event.getNewValue();
//        this.selectedAirline = line;
//        this.selectedFlights = line.getFlights();
        String airline = event.getNewValue().toString();
        List<Flight> flights = new ArrayList<Flight>();
        if (airline.equals("KLM")) {
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 790.80f,"KLM"));
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 820.00f,"KLM"));
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 989.00f,"KLM"));
        } else if (airline.equals("UnitedAirlines")) {
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 825.50f,"UnitedAirlines"));
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 1050.00f,"UnitedAirlines"));
        } else if (airline.equals("NorthWest")) {
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 795.55f,"NorthWest"));
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 875.00f,"NorthWest"));
        }
        else{
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 790.80f,"KLM"));
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 820.00f,"KLM"));
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 989.00f,"KLM"));
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 825.50f,"UnitedAirlines"));
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 1050.00f,"UnitedAirlines"));
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 795.55f,"NorthWest"));
            flights.add(new Flight("Amsterdam", "New York", "12/11/06", 875.00f,"NorthWest"));
        }
        this.selectedFlights = flights;
    }

//    public Airline getSelectedAirline() {
//        return selectedAirline;
//    }
    public String getSelectedAirline() {
        return selectedAirline;
    }

//    public void setSelectedAirline(Airline selectedAirline) {
//        this.selectedAirline = selectedAirline;
//    }
    public void setSelectedAirline(String selectedAirline) {
        this.selectedAirline = selectedAirline;
    }
}
