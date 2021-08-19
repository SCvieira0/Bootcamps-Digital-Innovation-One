package com.dio.java.controller;

import com.dio.java.model.TimeBank;
import com.dio.java.service.TimeBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/timeBank")
public class TimeBankController {

    @Autowired
    TimeBankService timeBankService;

    @PostMapping
    public TimeBank createTimeBank(@RequestBody TimeBank timeBank){
        return timeBankService.saveTimeBank(timeBank);
    }

    @PutMapping
    public TimeBank updateTimeBank(@RequestBody TimeBank timeBank){
        return timeBankService.updateTimeBank(timeBank);
    }

    @GetMapping
    public List<TimeBank> getTimeBankList(){
        return timeBankService.findAll();
    }

    @GetMapping("/{idTimeBank}")
    public ResponseEntity<TimeBank> getTimeBankById(@PathVariable("idTimeBank") Long idTimeBank) throws Exception{
        return ResponseEntity.ok(timeBankService.getById(idTimeBank).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @DeleteMapping("/{idTimeBank}")
    public ResponseEntity<TimeBank> deleteTimeBankById(@PathVariable("idTimeBank") Long idTimeBank) throws Exception{
        try {
            timeBankService.deleteTimeBank(idTimeBank);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<TimeBank>) ResponseEntity.ok();
    }
}
