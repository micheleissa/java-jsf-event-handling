/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.data;

import java.util.List;

/**
 *
 * @author Michel Eissa
 */
public class Airline {
    private String name;
    private List<Flight> flights;

    public Airline(String name, List<Flight> flights) {
        this.name = name;
        this.flights = flights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    @Override
    public String toString() {
        return  name;
    }
    
   
}
