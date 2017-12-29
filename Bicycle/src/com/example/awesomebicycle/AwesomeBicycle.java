package com.example.awesomebicycle;


import com.example.bicycle.Bicycle;

public class AwesomeBicycle implements Bicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        if (isMoving()){
            speed = speed - decrement;
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
