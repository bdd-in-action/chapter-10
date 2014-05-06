package com.bddinaction.chapter10.junit;

import com.bddinaction.chapter10.model.FrequentFlyer;
import com.bddinaction.chapter10.model.Status;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * A description goes here.
 * User: john
 * Date: 2/04/2014
 * Time: 10:33 PM
 */
public class WhenEarningStatusFromFrequentFlyerPoints {

    @Test
    public void a_member_should_be_able_to_earn_extra_status_points() {
        FrequentFlyer member = FrequentFlyer.withFrequentFlyerNumber("12345678")
                                            .named("Joe", "Bloggs");
        member.setStatusPoints(100);

        member.earns(150).statusPoints();

        assertThat(member.getStatusPoints()).isEqualTo(250);
    }

    @Test
    public void a_new_member_should_have_bronze_status() {
        FrequentFlyer member = FrequentFlyer.withFrequentFlyerNumber("12345678")
                                            .named("Joe", "Bloggs");

        assertThat(member.getStatus()).isEqualTo(Status.Bronze);
    }

    @Test
    public void should_obtain_a_new_status_when_enough_points_are_earned() {
        FrequentFlyer member = FrequentFlyer.withFrequentFlyerNumber("12345678")
                .named("Joe", "Bloggs");
        member.setStatusPoints(100);

        member.earns(200).statusPoints();

        assertThat(member.getStatus()).isEqualTo(Status.Silver);
    }


}
