/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vincent Yeung
 */
public class FlightTest {
    
    public FlightTest() {
    }

    /**
     * Test of setflightNumber method, of class Flight.
     */
    
    @Test
    public void testConstructorSameDestination(){
    String destination = "Toronto";
    String origin = "Toronto";
    int flightNumber = 1000;
    int capacity = 4;
    String time = "03/21/18 1:00 am";
    double price = 1568.98; 
    
    boolean expected = false;
    boolean result = !(destination.equals(origin));
    
    assertEquals(expected, result);
    }
    
    //just to test if they are the diff points
    @Test
    public void testConstructorDiffDestination(){
    String destination = "Toronto";
    String origin = "Boston";
    int flightnumber = 1000;
    int capacity = 4;
    String time = "03/21/18 1:00am";
    double price = 1568.98;
    
    boolean expected = true;
    boolean result = !(destination.equals(origin));
    
    assertEquals(expected, result);
    }
    
    @Test
    public void testSetflightNumber() {
        int a = 1009;
        Flight number = new Flight();
        
        number.setFlightNumber(1009); //used 108 and will fail
        assertEquals(number.getFlightNumber(), a);
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        int a = 01;
        Flight number = new Flight();
        
        number.setFlightNumber(01); //used 03 and will fail
        assertEquals(number.getFlightNumber(), a);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        String a = "china";
        Flight O = new Flight();
        
        O.setOrigin("china"); //anything string like ashdkf will fail
        assertEquals(O.getOrigin(), a);
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        String a = "Miami";
        Flight O = new Flight();
        
        O.setOrigin("Miami"); //anything string like ashdkf will fail
        assertEquals(O.getOrigin(), a);
    }

    /**
     * Test of SetDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        String a = "Montreal";
        Flight dest = new Flight();
        
        dest.setDestination("Montreal"); // used boston and this fails
        assertEquals(dest.getDestination(), a);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        String a = "Toronto";
        Flight dest = new Flight();
        
        dest.setDestination("Toronto");
        assertEquals(dest.getDestination(), a);
    }

    /**
     * Test of SetDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        String a = "09/12/18 2:13 am";
        Flight time = new Flight();
        
        time.SetDepartureTime("09/12/18 2:13 am");
        assertEquals(time.getDepartureTime(), a);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        String a = "09/12/18 2:09 am";
        Flight time = new Flight();
        
        time.SetDepartureTime("09/12/18 2:09 am");
        assertEquals(time.getDepartureTime(), a);
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        int a = 4;
        Flight b = new Flight();
        
        b.setCapacity(a);
        assertEquals(b.getCapacity(), a);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        int a = 20;
        Flight b = new Flight();
        
        b.setCapacity(20);
        assertEquals(b.getCapacity(), a);
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
    double a = 1000.00;
    Flight b = new Flight();
    
    b.setOriginalPrice(1000.00);
    
    assertEquals(b.getOriginalPrice(), a, 0.00001);
    
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
    double a = 50284.22;
    Flight b = new Flight();
    
    b.setOriginalPrice(a);
    assertEquals(b.getOriginalPrice(), a, 0.0001);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        int a = 3; //capacity in the other class
        Flight obj = new Flight();
        
        boolean expected = true;
        boolean result = obj.bookASeat(a);
        
        assertEquals(expected, result);
        
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        int F = 1009;
        String O = "Canada";
        String D = "L.A.";
        String dT = "09/12/2018 2:27 am";
        int C = 1;
        double P = 2000.0;
        
        Flight obj = new Flight(1009, "Canada", "L.A.", "09/12/2018 2:27 am", 1, 2000.00);
        
        String result = "Flight " + obj.getFlightNumber() + ", " + obj.getOrigin() + " to " + obj.getDestination() + ", " + obj.getDepartureTime() + ", original price: " + obj.getOriginalPrice() + "$"; 
        
        assertEquals(result, "Flight 1009, Canada to L.A., 09/12/2018 2:27 am, original price: 2000.0$");
    }
}
