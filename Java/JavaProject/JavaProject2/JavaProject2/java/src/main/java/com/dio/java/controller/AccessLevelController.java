package com.dio.java.controller;

import com.dio.java.model.AccessLevel;
import com.dio.java.service.AccessLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/accessLevel")
public class AccessLevelController {

    @Autowired
    AccessLevelService accessLevelService;

    @PostMapping
    public AccessLevel createAccessLevel(@RequestBody AccessLevel accessLevel){
        return accessLevelService.saveAccessLevel(accessLevel);
    }

    @PutMapping
    public AccessLevel updateAccessLevel(@RequestBody AccessLevel accessLevel){
        return accessLevelService.updateAccessLevel(accessLevel);
    }

    @GetMapping
    public List<AccessLevel> getAccessLevel(){ return accessLevelService.findAll();}

    @GetMapping("/{idAccessLevel}")
    public ResponseEntity<AccessLevel> getAccessLevelById(@PathVariable("idAccessLevel") Long idAccessLevel) throws Exception{
        return ResponseEntity.ok(accessLevelService.getById(idAccessLevel).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @DeleteMapping("/{idAccessLevel}")
    public ResponseEntity<AccessLevel> deleteAccessLevelById(@PathVariable("idAccessLevel") Long idAccessLevel) throws Exception{
        try{
            accessLevelService.deleteAccessLevel(idAccessLevel);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<AccessLevel>) ResponseEntity.ok();
    }
}
