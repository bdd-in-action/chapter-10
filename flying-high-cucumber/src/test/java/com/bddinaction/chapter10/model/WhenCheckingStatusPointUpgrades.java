package com.bddinaction.chapter10.model;

import com.bddinaction.chapter10.services.InMemoryStatusService;
import com.bddinaction.chapter10.services.StatusService;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WhenCheckingStatusPointUpgrades {


    StatusService statusService = new InMemoryStatusService();

    @Test
    public void should_stay_on_bronze_for_zero_points() {
        assertThat(statusService.statusLevelFor(0), is(Status.Bronze));
    }

    @Test
    public void should_stay_on_bronze() {
        assertThat(statusService.statusLevelFor(299), is(Status.Bronze));
    }

    @Test
    public void should_earn_silver() {
        assertThat(statusService.statusLevelFor(300), is(Status.Silver));
    }

    @Test
    public void should_stay_on_silver() {
        assertThat(statusService.statusLevelFor(699), is(Status.Silver));
    }

    @Test
    public void should_earn_gold() {
        assertThat(statusService.statusLevelFor(700), is(Status.Gold));
    }

    @Test
    public void should_cumulate_points_with_each_flight() {

        // GIVEN
        StatusService statusService = mock(StatusService.class);
        when(statusService.statusLevelFor(300)).thenReturn(Status.Silver);

        FrequentFlyer member = new FrequentFlyer("12345678","Joe", "Bloggs", statusService);

        // WHEN
        member.earns(100).statusPoints();
        member.earns(200).statusPoints();

        // THEN
        assertThat(member.getStatusPoints(),is(greaterThanOrEqualTo((300))));
        assertThat(member.getStatus(), is(Status.Silver));
    }

    @Test
    public void should_see_next_obtainable_statuses() {
        FrequentFlyer member = FrequentFlyer.withFrequentFlyerNumber("12345678").named("Joe", "Bloggs");
        assertThat(member.getUnachievedStatuses(), hasItems(Status.Gold, Status.Platinum));
    }
}
