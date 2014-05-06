package com.bddinaction.chapter10.services;

import com.bddinaction.chapter10.model.Status;

public class InMemoryStatusService implements StatusService {
    public Status statusLevelFor(int statusPoints) {
        Status highestMatchingStatus = Status.Bronze;
        for(Status status : Status.values())  {
            if (statusPoints >= status.getMinimumPoints()) {
                highestMatchingStatus = status;
            }
        }
        return highestMatchingStatus;
    }
}
