package com.bddinaction.chapter10.model;

/**
 * A description goes here.
 * Persona: john
 * Date: 15/08/13
 * Time: 3:22 PM
 */
public class Trip {
    private int points = 439;
    String departure;
    String destination;


    public Trip(String departure, String destination, int points) {
        this.points = points;
        this.departure = departure;
        this.destination = destination;
    }

    public int getPoints() {
        return points;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }
}
