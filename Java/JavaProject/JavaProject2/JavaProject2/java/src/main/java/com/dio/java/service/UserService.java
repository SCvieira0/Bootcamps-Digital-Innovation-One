package com.dio.java.service;

import com.dio.java.model.User;
import com.dio.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> getById(Long idUser){
        return userRepository.findById(idUser);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long idUser){
        userRepository.deleteById(idUser);
    }
}
