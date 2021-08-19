package com.dio.java.controller;

import com.dio.java.model.UserCategory;
import com.dio.java.service.UserCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/userCategory")
public class UserCategoryController {

    @Autowired
    UserCategoryService userCategoryService;

    @PostMapping
    public UserCategory createUserCategory(@RequestBody UserCategory userCategory){
        return userCategoryService.saveUserCategory(userCategory);
    }

    @PutMapping
    public UserCategory updateUserCategory(@RequestBody UserCategory userCategory){
        return userCategoryService.updateUserCategory(userCategory);
    }

    @GetMapping
    public List<UserCategory> getUserCategoryList(){
        return userCategoryService.findAll();
    }

    @GetMapping("/{idUserCategory}")
    public ResponseEntity<UserCategory> getUserCategoryById(@PathVariable("idUserCategory") Long idUserCategory) throws Exception{
        return ResponseEntity.ok(userCategoryService.getById(idUserCategory).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @DeleteMapping("/{idUserCategory}")
    public ResponseEntity<UserCategory> deleteUserCategoryById(@PathVariable("idUserCategory") Long idUserCategory) throws Exception{
        try {
            userCategoryService.deleteUserCategory(idUserCategory);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<UserCategory>) ResponseEntity.ok();
    }
}
