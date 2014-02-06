package com.bddinaction.chapter10.steps;

import com.bddinaction.chapter10.model.FrequentFlyerMember;
import com.bddinaction.chapter10.model.Members;
import com.bddinaction.chapter10.model.Trip;
import com.bddinaction.chapter10.steps.thucydides.TestDatabaseAPI;
import com.bddinaction.chapter10.steps.thucydides.TripSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

public class EarningPointsSteps {

    TestDatabaseAPI inTheTestDatabase;

    @Given("the flying distance between $departure and $destination is $distance km")
    public void defineTheFlyingDistanceForATrip(String departure,
                                                String destination,
                                                int distance) {
//        inTheTestDatabase.theDistanceBetween(departure).and(destination).is(distance);
    }


    @Steps
    TripSteps trips;
    Members members = new Members();

    FrequentFlyerMember member;

    @Given("I am a $status Frequent Flyer member")
    public void defineAMemberWithStatus(String status) {
        member = members.getMember().withStatus(status);
    }

    Trip trip;


    @When("I fly from $departure to $destination")
    public void whenIFlyFrom(String departure, String destination) {
//        trip = trips.lookupTrip(departure, destination, time, date);
    }

    @When("I fly from $departure to $destination in $status class")
    public void whenIFlyFrom(String departure, String destination, String status) {
//        trip = trips.lookupTrip(departure, destination, time, date);
    }
    @When("I fly from $departure to $destination on $date at $time")
    public void whenIFlyFrom(String departure, String destination,
                             DateTime date, LocalTime time) {
//        trip = trips.lookupTrip(departure, destination, time, date);
    }

    @Then("I should earn $points points")
    public void thenIShouldEarn(int points) {
//        int earnedPoints = member.getPointsFor(trip);
//        assertThat(points).isEqualTo(earnedPoints);
    }

    @Given("that I want to become a Frequent Flyer")
    public void givenThatIWantToBecomeAFrequentFlyer() {
    }

    @When("I register for the Frequent Flyer program")
    public void whenIRegisterForTheFrequentFlyerProgram() {
    }

    @Then("I should receive an email like this: $email")
    public void thenIShouldReceiveAnEmailLikeThis(String email) {
    }
    @Then("it should all work")
    public void itShouldAllWork() {}

    @Given("I am a $status member")
    public void statusIs(String status) {
        System.out.println("STATUS = " + status);
    }

    @When("I fly on a flight that is worth $foo base points")
    public void flyFor(int base) {}

    @Then("I should earn a status bonus of $bonus")
    public void shouldEarnStatusBonus(int bonus) {}

    @Then("I should have guaranteed minimum earned points per trip of <minimum>")
    public void shouldHaveGuaranteedMinimum(int minimum) {}


    @Then("I should earn <total> points in all")
    public void shouldEarnTotalOf(int total) {}
}
