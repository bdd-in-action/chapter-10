package com.bddinaction.chapter10.model;

public enum FrequentFlyerMember {

    Gold(10000), Silver(10001), Bronze(10002), Standard(10003);

    private FrequentFlyerMember(long membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public final long membershipNumber;

    public int getPointsFor(Trip trip) {
        return 439;
    }
}
