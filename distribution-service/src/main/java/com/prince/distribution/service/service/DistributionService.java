package com.prince.distribution.service.service;

import com.prince.distribution.service.entity.Distribution;

import java.util.List;

public interface DistributionService {

    Distribution saveDistribution(Distribution distribution);
    List<Distribution> getAllDistribution();
    List<Distribution> getAllDistributionByCategory();
    List<Distribution> getAllBySite();

}
