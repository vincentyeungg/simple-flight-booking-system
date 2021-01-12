/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author v6yeung
 */
public abstract class Passenger {
    protected String name;
    protected int age;
    
    public Passenger(){}
    
    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     *
     * @param p
     * @return
     */
    public abstract double applyDiscount(double p);
    
}

//make the subclasses now