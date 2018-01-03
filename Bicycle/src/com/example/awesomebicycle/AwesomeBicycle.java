package com.example.awesomebicycle;

import com.example.bicycle.Bicycle;

public class AwesomeBicycle implements Bicycle {
    // three fields (member variables)
    private int cadence;
    private int speed;
    private int gear;

    //one  constructor
    public AwesomeBicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // can also have a no argument constructor because they have diff argument lists
    public AwesomeBicycle() {
        gear = 1;
        cadence = 10;
        speed = 0;
    }

    public void changeCadence(int newValue) {
        // variables in a method are local variables
        cadence = newValue;
    }

    public int getCadence() {
        return cadence;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        if (isMoving()){
            speed -= decrement;
        } else {
            System.out.println("bike has already stopped!");
        }
    }

    public boolean isMoving() {
       return speed > 0 ? true : false;
    }

    public void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}
