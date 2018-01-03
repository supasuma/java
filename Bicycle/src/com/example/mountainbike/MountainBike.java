package com.example.mountainbike;

import com.example.awesomebicycle.AwesomeBicycle;

public class MountainBike extends AwesomeBicycle {

    public int seatHeight;

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
       super(startCadence, startSpeed, startGear);
       seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
