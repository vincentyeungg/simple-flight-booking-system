/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author Vincent Yeung
 */
import java.util.*;
/**
 *
 * @author v6yeung
 */
public class Flight {
    
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private static int numberOfSeatsLeft; //keep track of how many seats are left
    private double originalPrice;

    public Flight(){}

//create constructor    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice){
    //six paramaters in this constructor 
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
	
	//initialize numofseats
        
        //if destinations are equal, then throw IllegalArgExp
       
        if((this.origin).equals(destination)){
            throw new IllegalArgumentException("Destination and Origin are the same");
        }
        
        else{   this.destination = destination; } //initialize if they are diff points
         
   }

    //Setters and Getters
    
    public void setFlightNumber(int flightNum){
        this.flightNumber = flightNum;
    }
    
    public int getFlightNumber(){
        return this.flightNumber;
    }
    
    public void setOrigin(String Origin){
        this.origin = Origin;
    }
    
    public String getOrigin(){
        return this.origin;
    }
    
    public void setDestination(String Destination){
        this.destination = Destination;
    };
    
    public String getDestination(){
        return this.destination;
    }
   
    public void SetDepartureTime(String DepartureTime){
        this.departureTime = DepartureTime;
    }
    
    public String getDepartureTime(){
        return this.departureTime;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public void setOriginalPrice(double OriginalPrice){
        this.originalPrice = OriginalPrice;
    }
    
    public double getOriginalPrice(){
        return this.originalPrice;
    }
   
    /*
    public void setNumberOfSeatsLeft(int NumberOfSeatsLeft){
        this.NumberOfSeatsLeft = NumberOfSeatsLeft;
    }
    
    public getNumberOfSeatsLeft(){
        return this.NumberOfSeatsLeft;
    }

    */
    
    boolean bookASeat(int counter){ //make this boolean?
            numberOfSeatsLeft = this.capacity;
            numberOfSeatsLeft -= counter;
            this.capacity = numberOfSeatsLeft;
            if(numberOfSeatsLeft > 0){return true;}
            else {return false;} 
        }
    
    
    @Override
    public String toString(){
     
        return "Flight" + " " + this.flightNumber + ", " + this.origin + " to " + this.destination + ", " +   this.departureTime + ", original price: " +  this.originalPrice + "$";
    }
    
}