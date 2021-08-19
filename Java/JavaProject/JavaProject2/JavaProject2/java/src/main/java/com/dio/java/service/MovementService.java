package com.dio.java.service;

import com.dio.java.model.Movement;
import com.dio.java.repository.MovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovementService {

    @Autowired
    MovementRepository movementRepository;

    public Movement saveMovement(Movement movement){
        return movementRepository.save(movement);
    }

    public List<Movement> findAll(){
        return movementRepository.findAll();
    }

    public Optional<Movement> getById(Long idMovement){
        return movementRepository.findById(idMovement);
    }

    public Movement updateMovement(Movement movement){
        return movementRepository.save(movement);
    }

    public void deleteMovement(Long idMovement){
        movementRepository.deleteById(idMovement);
    }
}
