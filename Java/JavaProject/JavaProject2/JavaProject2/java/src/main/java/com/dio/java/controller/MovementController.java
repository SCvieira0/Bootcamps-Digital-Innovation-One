package com.dio.java.controller;

import com.dio.java.model.Movement;
import com.dio.java.service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping
public class MovementController {

    @Autowired
    MovementService movementService;

    @PostMapping
    public Movement createMovement(@RequestBody Movement movement){
        return movementService.saveMovement(movement);
    }

    @PutMapping
    public Movement updateMovement(@RequestBody Movement movement){
        return movementService.updateMovement(movement);
    }

    @GetMapping
    public List<Movement> getMovementList(){
        return movementService.findAll();
    }

    @GetMapping("/{idMovement}")
    public ResponseEntity<Movement> getMovementById(@PathVariable("idMovement") Long idMovement) throws Exception{
        return ResponseEntity.ok(movementService.getById(idMovement).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @DeleteMapping("/{idMovement}")
    public ResponseEntity<Movement> deleteMovementById(@PathVariable("idMovement") Long idMovement) throws Exception{
        try {
            movementService.deleteMovement(idMovement);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Movement>) ResponseEntity.ok();
    }

}
