package com.bddinaction.chapter10.services;

import com.bddinaction.chapter10.model.Status;

public interface StatusService {
    Status statusLevelFor(int statusPoints);
}
