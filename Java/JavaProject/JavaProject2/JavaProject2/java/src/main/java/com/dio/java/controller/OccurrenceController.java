package com.dio.java.controller;

import com.dio.java.model.Occurrence;
import com.dio.java.service.OccurrenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/occurrence")
public class OccurrenceController {

    @Autowired
    OccurrenceService occurrenceService;

    @PostMapping
    public Occurrence createOccurrence(@RequestBody Occurrence occurrence){
        return occurrenceService.saveOccurrence(occurrence);
    }

    @PutMapping
    public Occurrence updateOccurrence(@RequestBody Occurrence occurrence){
        return occurrenceService.updateOccurrence(occurrence);
    }

    @GetMapping
    public List<Occurrence> getOccurrenceList(){
        return occurrenceService.findAll();
    }

    @GetMapping("/{idOccurrence}")
    public ResponseEntity<Occurrence> getOccurrenceById(@PathVariable("idOccurrence") Long idOccurrence) throws Exception{
        return ResponseEntity.ok(occurrenceService.getById(idOccurrence).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @DeleteMapping("/{idOccurrence}")
    public ResponseEntity<Occurrence> deleteOccurrenceById(@PathVariable("idOccurrence") Long idOccurrence) throws Exception{
        try {
            occurrenceService.deleteOccurrence(idOccurrence);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Occurrence>) ResponseEntity.ok();
    }
}
