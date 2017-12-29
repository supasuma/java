package com.example.bicycle;

public interface Bicycle {
    public void changeCadence(int newValue);
    public void changeGear(int newValue);
    public void speedUp(int increment);
    public void applyBrakes(int decrement);
    public void printStates();
    public boolean isMoving();
}