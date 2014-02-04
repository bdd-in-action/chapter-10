package com.bddinaction.chapter10.model;

/**
 * A description goes here.
 * Persona: john
 * Date: 15/08/13
 * Time: 4:10 PM
 */
public class Members {
    public Members getMember() {
        return this;
    }

    public FrequentFlyerMember withStatus(String status) {
        return FrequentFlyerMember.Gold;
    }
}
