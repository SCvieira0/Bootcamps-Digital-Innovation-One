package com.dio.java.controller;

import com.dio.java.model.WorkJourney;
import com.dio.java.service.WorkJourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/journey")
public class WorkJourneyController {

    @Autowired
    WorkJourneyService workJourneyService;

    @PostMapping
    public WorkJourney createWorkJourney(@RequestBody WorkJourney workJourney){
        return workJourneyService.saveWorkJourney(workJourney);
    }

    @PutMapping
    public WorkJourney updateWorkJourney(@RequestBody WorkJourney workJourney){
        return workJourneyService.updateWorkJourney(workJourney);
    }

    @GetMapping
    public List<WorkJourney> getWorkJourneyList(){
        return workJourneyService.findAll();
    }

    @GetMapping("/{idWorkJourney}")
    public ResponseEntity<WorkJourney> getWorkJourneyById(@PathVariable("idWorkJourney") Long idWorkJourney) throws Exception{
        return ResponseEntity.ok(workJourneyService.getById(idWorkJourney).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @DeleteMapping("/{idWorkJourney}")
    public ResponseEntity<WorkJourney> deleteWorkJourneyById(@PathVariable("idWorkJourney") Long idWorkJourney) throws Exception{
        try {
            workJourneyService.deleteWorkJourney(idWorkJourney);
        }catch (Exception e){
           System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkJourney>) ResponseEntity.ok();
    }
}
