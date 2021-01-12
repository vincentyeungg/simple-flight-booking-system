/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author v6yeung
 */
public class Member extends Passenger{ //subclass to override abs in passenger
    
    //passenger obj that flies frequent
    //this method has the stuff from passenger
    
    private int yearsOfMembership;
    
    //make constructor
    /**
     *
     * @param name
     * @param age
     * @param yearsOfMembership
     */
    
    public Member(String name, int age, int yearsOfMembership){
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

        /**
         * @return the yearsOfMembership
         */
        public int getYearsOfMembership() {
            return yearsOfMembership;
        }

        /**
         * @param yearsOfMembership the yearsOfMembership to set
         */
        public void setYearsOfMembership(int yearsOfMembership) {
            this.yearsOfMembership = yearsOfMembership;
        }
    
        @Override
        public double applyDiscount(double p){
            double price;
            if(this.yearsOfMembership > 5){
                price = p*(0.5); // half price
            }
            else if(this.yearsOfMembership > 1 && this.yearsOfMembership <= 5){
                price = p*(0.9);
            }
            
            else{
                price = p;
            }
            return price;
        } //override the abstract method
    
}