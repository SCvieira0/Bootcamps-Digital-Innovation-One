package com.dio.java.repository;

import com.dio.java.model.WorkJourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkJourneyRepository extends JpaRepository<WorkJourney, Long> {
}
