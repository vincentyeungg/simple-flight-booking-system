/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author Vincent Yeung
 */

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    
    List<Flight> flights = new ArrayList<Flight>();
    List<Ticket> ticket = new ArrayList<Ticket>();
    int counter = 0;
    
    Manager(){}
    
    public void createFlights(){
    //create a couple flights to be display to the user for choices
    flights.add(new Flight(1, "A", "B", "10/08/18 08:30 pm", 50, 1600.00));
    flights.add(new Flight(2, "A", "C", "10/08/18 05:30 am", 100, 900.00));
    flights.add(new Flight(3, "A", "D", "10/08/18 07:30 pm", 87, 2000.00));
    flights.add(new Flight(4, "A", "E", "11/08/18 04:30 am", 58, 1600.00));
    flights.add(new Flight(5, "A", "F", "11/08/18 10:30 pm", 87, 1000.00));
    flights.add(new Flight(6, "A", "G", "12/08/18 12:30 am", 4, 1230.00));
    flights.add(new Flight(7, "A", "H", "12/08/18 11:30 pm", 1, 1423.00));
    flights.add(new Flight(8, "A", "I", "01/08/19 10:30 am", 127, 900.00));
    flights.add(new Flight(9, "A", "B", "01/08/19 10:30 pm", 91, 1800.00));
    flights.add(new Flight(10, "A", "C", "10/31/18 111:30 pm", 40, 500.00));
    flights.add(new Flight(11, "A", "F", "12/08/18 08:30 pm", 21, 700.00));
    flights.add(new Flight(12, "A", "G", "03/08/19 10:30 am", 31, 850.00));
    flights.add(new Flight(13, "A", "D", "02/08/19 10:30 am", 68, 750.00));
    
    
    for(Flight flight: flights){
        System.out.println(flight); //should return the long string from Flight class
        }
    }

    
    public void displayAvailableFlights(String origin, String destination){     
    
    for(Flight flight: flights){
        if((flight.getOrigin()).equals(origin) && (flight.getDestination()).equals(destination)){
                System.out.println(flight);
            }
        else{} //do nothing 
        }
    }
    
    
    //public Flight getFlight(int flightNumber){
    //return the flight object for specified flight
   // }
    
    public void bookSeat(int flightNumber, Passenger p){
        
                //below will cycle through and find the flight with the matching number
                for(Flight flight: flights){
                    if((flight.getFlightNumber()) == flightNumber){
                        double originalprice = flight.getOriginalPrice();
                        double newprice = p.applyDiscount(originalprice);
                        //create a counter as a representation of the # of people to board
                        //if this number calling bookSeat method returns fall this will tell user theres no more seats and end
                        counter = 1;
                        
                        if(flight.bookASeat(counter) == true){
                        
                            //if((flight.bookASeat(numpeople)) == true){
                                //it means there are seats left and now lets assign seats for them
                                //can now create ticket
                                
                                ticket.add( new Ticket (p, flight, newprice));
                                //System.out.println("\nBooking successful!\n");
                                System.out.println("\nHere is your ticket:\n" + ticket);
                                break;
                        }
                        else{System.out.println("\nNo more available seats in this flight.\n");}
                    }
                    else{
                        System.out.println("\nThe following flight is not an option from the list of flights shown\n");
                        break; //jump out of conditional loop
                    }
                }
                
    }
    
    public static void main(String[] args){
        //call other methods of manager class to see if they work
        //develop plan to convince ta for the main method
        
        int numpeople;
        
        System.out.println("This is the booking system for the selected airlines. \n Below will show the flights currently available.\n");
        
        //while(a==1){
        Manager m1 = new Manager();
        m1.createFlights(); //display the screen of the several flights available
        
        Scanner input = new Scanner(System.in); //get input from user
        
        System.out.println("\nEnter your starting point below\n"); 
        String org = input.nextLine(); //this should put the origin and destination into the array
        
        System.out.println("\nEnter your destination point below\n");
        String dest = input.nextLine();
        
            if(org.equals(dest)){
                throw new IllegalArgumentException("invalid inputs\n");
            }
            else{
            } //do nothing
        
        //From here we should display the flights only that matches the flights wth the same org and dest
        m1.displayAvailableFlights(org, dest);//flow of control jump to called method
        
        System.out.println("\nWould you like to book a flight now?\t(y/n)\n");
        char y_n2 = input.next().charAt(0);
     
        if('y' == y_n2){
        //book a flight now
                System.out.println("\nEnter the flight number of your choice for your given specifications\n");
                int fnumber = input.nextInt();
                //book a flight now
                
                //here we will see how many tickets to print for the specified quantity
                System.out.println("\nEnter the number of people that will like to board this flight\n");
                numpeople = input.nextInt(); 
                
                for(int i=0;i<numpeople;i++){
                
                System.out.println("\nEnter the full name of passenger: " + (i+1));
                input.nextLine();
                String fname = input.nextLine();
                
                System.out.println("\nEnter your age below\n");
                int age = input.nextInt();
                
                System.out.println("\nAre you a member?\n y for yes\n n for no\n");
                char letter = input.next().charAt(0);
               
             //implrement the flight for the memeber price
                if('y' == letter){
                //this means the person is a member
                
                    System.out.println("\nHow many years have you been a member for?\n");
                    int myears = input.nextInt();
                
                Passenger p1 = new Member(fname, age, myears); //create new member
                
                m1.bookSeat(fnumber, p1); // call this method and compute price?
                }
                
                if('n' == letter){
                    Passenger p1 = new NonMember(fname, age);
                    m1.bookSeat(fnumber, p1);
                }
                
                else{
                }
            }
        }    
         
            if('n' == y_n2){
                //terminate the prog
                System.out.println("\nThis program will now close. Thank you.");
            }  
            else{
            }
        }
    }