package com.dio.java.service;

import com.dio.java.model.Calendar;
import com.dio.java.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarService {

    @Autowired
    CalendarRepository calendarRepository;

    public Calendar saveCalendar(Calendar calendar){
        return calendarRepository.save(calendar);
    }

    public List<Calendar> findAll(){
        return calendarRepository.findAll();
    }

    public Optional<Calendar> getById(Long idCalendar){
        return calendarRepository.findById(idCalendar);
    }

    public Calendar updateCalendar(Calendar calendar){
        return calendarRepository.save(calendar);
    }

    public void deleteCalendar(Long idCalendar){
        calendarRepository.deleteById(idCalendar);
    }
}
