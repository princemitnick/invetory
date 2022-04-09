package com.prince.distribution.service.repository;

import com.prince.distribution.service.entity.Distribution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistributionRepository extends JpaRepository<Distribution, Long> {
}
