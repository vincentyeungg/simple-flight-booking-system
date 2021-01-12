/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author v6yeung
 */

public class NonMember extends Passenger{ //subclass to override abs in passenger

    public NonMember(String name, int age){
        super(name, age);
    }
        //passenger who is not frequent flyer
    
        @Override
        public double applyDiscount(double p){
            double price;
            if(age > 65){
                price = p*0.9;
            }
            else{
                price = p;
            }
            return price;
        }
        
    }