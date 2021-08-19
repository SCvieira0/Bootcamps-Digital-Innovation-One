package com.dio.java.service;

import com.dio.java.model.AccessLevel;
import com.dio.java.repository.AccessLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccessLevelService {

    @Autowired
    AccessLevelRepository accessLevelRepository;

    public AccessLevel saveAccessLevel(AccessLevel accessLevel){
        return accessLevelRepository.save(accessLevel);
    }

    public List<AccessLevel> findAll(){ return accessLevelRepository.findAll();}

    public Optional<AccessLevel> getById(Long idAccessLevel){ return accessLevelRepository.findById(idAccessLevel);}

    public AccessLevel updateAccessLevel(AccessLevel accessLevel){ return  accessLevelRepository.save(accessLevel);}

    public void deleteAccessLevel(Long idAccessLevel){ accessLevelRepository.deleteById(idAccessLevel);}

}
