package com.dio.java.service;

import com.dio.java.model.UserCategory;
import com.dio.java.repository.UserCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserCategoryService {

    @Autowired
    UserCategoryRepository userCategoryRepository;

    public UserCategory saveUserCategory(UserCategory userCategory){
        return userCategoryRepository.save(userCategory);
    }

    public List<UserCategory> findAll(){
        return userCategoryRepository.findAll();
    }

    public Optional<UserCategory> getById(Long idUserCategory){
        return userCategoryRepository.findById(idUserCategory);
    }

    public UserCategory updateUserCategory(UserCategory userCategory){
        return userCategoryRepository.save(userCategory);
    }

    public void deleteUserCategory(Long idUserCategory){
        userCategoryRepository.deleteById(idUserCategory);
    }
}
