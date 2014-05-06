package com.bddinaction.chapter10.junit;


import com.bddinaction.chapter10.model.FrequentFlyer;
import com.bddinaction.chapter10.model.Status;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class WhenRegisteringANewFrequentFlyerMember {

    @Test
    public void should_be_able_to_create_a_new_member() {
        FrequentFlyer member = FrequentFlyer.withFrequentFlyerNumber("123456789")
                .named("Jill", "Smith");

        assertThat(member.getFirstName()).isEqualTo("Jill");
        assertThat(member.getLastName()).isEqualTo("Smith");
        assertThat(member.getFrequentFlyerNumber()).isEqualTo("123456789");
    }

    @Test
    public void the_members_initial_status_should_be_bronze() {
        FrequentFlyer member = FrequentFlyer.withFrequentFlyerNumber("123456789")
                .named("Jill", "Smith");

        assertThat(member.getStatus()).isEqualTo(Status.Bronze);
    }
}
