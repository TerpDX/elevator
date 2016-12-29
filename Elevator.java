package com.company;

/**
 * Created by CPerilli on 11/28/2016.
 */
public class Elevator {
    int currentFloor, destination, numPassengers;
    boolean empty;

    public Elevator() {
        this.currentFloor = 1;
        this.destination = 1;
        this.numPassengers = 0;
        this.empty = true;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getDestination() {
        return destination;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public boolean isEmpty() {
        return empty;
    }

} //end Elevator
