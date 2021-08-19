package com.dio.java.service;

import com.dio.java.model.WorkJourney;
import com.dio.java.repository.WorkJourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkJourneyService {

    @Autowired
    WorkJourneyRepository workJourneyRepository;

    public WorkJourney saveWorkJourney(WorkJourney workJourney){
        return workJourneyRepository.save(workJourney);
    }

    public List<WorkJourney> findAll(){
        return workJourneyRepository.findAll();
    }

    public Optional<WorkJourney> getById(Long idWorkJourney){
        return workJourneyRepository.findById(idWorkJourney);
    }

    public WorkJourney updateWorkJourney(WorkJourney workJourney){
        return workJourneyRepository.save(workJourney);
    }

    public void deleteWorkJourney(Long idWorkJourney){
        workJourneyRepository.deleteById(idWorkJourney);
    }
}
