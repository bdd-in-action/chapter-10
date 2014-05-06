package com.bddinaction.chapter10.junit;

import com.bddinaction.chapter10.model.FrequentFlyer;
import com.bddinaction.chapter10.model.Status;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;
import static org.hamcrest.Matchers.allOf;


public class WhenCheckingMinimumStatusPointsWithFest {

    FrequentFlyer member;

    @Before
    public void newFrequentFlyer() {
        member = FrequentFlyer.withFrequentFlyerNumber("12345678").named("Joe", "Bloggs");
    }

    @Test
    public void should_have_bronze_status_initially() {
        assertThat(member.getStatus()).isEqualTo(Status.Bronze);
    }

        @Test
    public void should_see_next_obtainable_statuses() {
        assertThat(member.getUnachievedStatuses()).contains(Status.Gold, Status.Platinum);
    }
//
//    @Test
//    public void should_cumulate_points_with_each_flight() {
//
//        FrequentFlyer member = FrequentFlyer.withFrequentFlyerNumber("12345678").named("Joe", "Bloggs");
//
//        member.earns(100);
//        member.earns(200);
//
//        assertThat(member.getStatusPoints(),is(greaterThanOrEqualTo((300))));
//        assertThat(member.getStatus(), is(Status.Silver));
//    }
//
//    @Test
//    public void should_see_next_obtainable_statuses() {
//        assertThat(member.getUnachievedStatuses(), hasItem(Status.Gold));
//    }
}
