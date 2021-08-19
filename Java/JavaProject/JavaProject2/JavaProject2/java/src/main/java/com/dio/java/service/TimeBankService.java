package com.dio.java.service;

import com.dio.java.model.TimeBank;
import com.dio.java.repository.TimeBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeBankService {

    @Autowired
    TimeBankRepository timeBankRepository;

    public TimeBank saveTimeBank(TimeBank timeBank){
        return timeBankRepository.save(timeBank);
    }

    public List<TimeBank> findAll(){
        return timeBankRepository.findAll();
    }

    public Optional<TimeBank> getById(Long idTimeBank){
        return timeBankRepository.findById(idTimeBank);
    }

    public TimeBank updateTimeBank(TimeBank timeBank){
        return timeBankRepository.save(timeBank);
    }

    public void deleteTimeBank(Long idTimeBank){
        timeBankRepository.deleteById(idTimeBank);
    }
}
