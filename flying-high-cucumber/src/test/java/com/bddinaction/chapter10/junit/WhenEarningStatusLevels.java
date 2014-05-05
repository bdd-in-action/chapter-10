package com.bddinaction.chapter10.junit;


import com.bddinaction.chapter10.model.FrequentFlyer;
import com.bddinaction.chapter10.model.Status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static com.bddinaction.chapter10.model.Status.Bronze;
import static com.bddinaction.chapter10.model.Status.Gold;
import static com.bddinaction.chapter10.model.Status.Platinum;
import static com.bddinaction.chapter10.model.Status.Silver;
import static org.fest.assertions.Assertions.assertThat;

@RunWith(Parameterized.class)
public class WhenEarningStatusLevels {

    @Parameters
    public static Collection pointsPerStatus() {
        return Arrays.asList(new Object[][]{
                {Bronze, 0,   100,  Bronze},
                {Bronze, 0,   300,  Silver},
                {Bronze, 100, 200,  Silver},
                {Silver, 0,   700,  Gold},
                {Gold,   0,   1500, Platinum}
        });
    }

    Status initialStatus, finalStatus;
    int initialPoints, earnedPoints;

    public WhenEarningStatusLevels(Status initialStatus,  int initialPoints,
                                   int earnedPoints, Status finalStatus) {
        this.initialStatus = initialStatus;
        this.initialPoints = initialPoints;
        this.earnedPoints = earnedPoints;
        this.finalStatus = finalStatus;
    }

    @Test
    public void should_earn_new_status_based_on_point_thresholds() {
        FrequentFlyer member = FrequentFlyer.withFrequentFlyerNumber("12345678")
                                            .named("Joe", "Bloggs")
                                            .withStatusPoints(initialPoints)
                                            .withStatus(initialStatus);

        member.earns(earnedPoints).statusPoints();

        assertThat(member.getStatus()).isEqualTo(finalStatus);


    }
}
