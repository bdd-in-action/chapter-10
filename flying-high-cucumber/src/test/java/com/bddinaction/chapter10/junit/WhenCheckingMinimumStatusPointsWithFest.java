package com.bddinaction.chapter10.junit;

import com.bddinaction.chapter10.model.FrequentFlyer;
import com.bddinaction.chapter10.model.FrequentFlyerStatus;
import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;


public class WhenCheckingMinimumStatusPointsWithFest {

    FrequentFlyer member;

    @Before
    public void newFrequentFlyer() {
        member = FrequentFlyer.withFrequentFlyerNumber("12345678").named("Joe", "Bloggs");
    }

    @Test
    public void should_have_bronze_status_initially() {
        assertThat(member.getStatus()).isEqualTo(FrequentFlyerStatus.BRONZE);
    }

        @Test
    public void should_see_next_obtainable_statuses() {
        assertThat(member.getUnachievedStatuses()).contains(FrequentFlyerStatus.GOLD, FrequentFlyerStatus.PLATINUM);
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
//        assertThat(member.getStatus(), is(FrequentFlyerStatus.SILVER));
//    }
//
//    @Test
//    public void should_see_next_obtainable_statuses() {
//        assertThat(member.getUnachievedStatuses(), hasItem(FrequentFlyerStatus.GOLD));
//    }
}
