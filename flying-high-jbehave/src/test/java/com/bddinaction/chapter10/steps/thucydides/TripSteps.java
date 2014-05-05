package com.bddinaction.chapter10.steps.thucydides;

import com.bddinaction.chapter10.model.Trip;
import com.beust.jcommander.internal.Lists;
import net.thucydides.core.annotations.Step;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

import java.util.List;

/**
 * A description goes here.
 * Persona: john
 * Date: 15/08/13
 * Time: 3:29 PM
 */
public class TripSteps {


    @Step("Lookup trip from {0} to {1}")
    public Trip lookupTrip(String departure, String destination) {
        return new Trip(departure,departure,0);
    }

    @Step("Lookup trip from {0} to {1} leaving at {3} on {2}")
    public Trip lookupTrip(String departure, String destination, LocalTime time, DateTime date) {
        return lookupTrip(departure, destination);
    }
}
