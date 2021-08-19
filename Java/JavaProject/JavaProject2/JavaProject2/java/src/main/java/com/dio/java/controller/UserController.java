package com.dio.java.controller;

import com.dio.java.model.User;
import com.dio.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @GetMapping
    public List<User> getUserList(){
        return userService.findAll();
    }

    @GetMapping("/{idUser}")
    public ResponseEntity<User> getUserById(@PathVariable("idUser") Long idUser) throws Exception{
        return ResponseEntity.ok(userService.getById(idUser).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @DeleteMapping("/{idUser}")
    public ResponseEntity<User> deleteUserById(@PathVariable("idUser") Long idUser) throws Exception{
        try {
            userService.deleteUser(idUser);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<User>) ResponseEntity.ok();
    }
}
