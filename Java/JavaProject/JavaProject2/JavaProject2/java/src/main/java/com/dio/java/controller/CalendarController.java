package com.dio.java.controller;

import com.dio.java.model.Calendar;
import com.dio.java.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    @Autowired
    CalendarService calendarService;

    @PostMapping
    public Calendar createCalendar(@RequestBody Calendar calendar){
        return calendarService.saveCalendar(calendar);
    }

    @PutMapping
    public Calendar updateCalendar(@RequestBody Calendar calendar){
        return calendarService.updateCalendar(calendar);
    }

    @GetMapping
    public List<Calendar> getCalendarList(){
        return calendarService.findAll();
    }

    @GetMapping("/{idCalendar}")
    public ResponseEntity<Calendar> getCalendarById(@PathVariable("idCalendar") Long idCalendar) throws Exception{
        return ResponseEntity.ok(calendarService.getById(idCalendar).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @DeleteMapping("/{idCalendar}")
    public ResponseEntity<Calendar> deleteCalendarById(@PathVariable("idCalendar") Long idCalendar) throws Exception{
        try {
            calendarService.deleteCalendar(idCalendar);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Calendar>) ResponseEntity.ok();
    }
}
