/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author v6yeung
 */

//this class will represent a flight ticket

public class Ticket {
    
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int ticketNum;
    private static int counter = 0;
    
    public Ticket(Passenger p, Flight flight, double price){
        this.passenger=p;
        this.flight = flight;
        this.price = price;
    }

    /**
     * @return the passenger
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * @param passenger the passenger to set
     */
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    /**
     * @return the flight
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * @param flight the flight to set
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
        /**
     * @return the ticketNum
     */
    public int getTicketNum() {
        ticketNum += counter;
        return ticketNum;
    }

    /**
     * @param aTicketNum the ticketNum to set
     */
    
    @Override
    public String toString(){
        //want to add the toString() of Flight class
        return passenger.getName() + ", " + flight + ", ticket price: " + this.price + "$"; 
    }
    
    
}