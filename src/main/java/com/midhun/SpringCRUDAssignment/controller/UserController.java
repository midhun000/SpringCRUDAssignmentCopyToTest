package com.midhun.SpringCRUDAssignment.controller;

import com.midhun.SpringCRUDAssignment.model.User;
import com.midhun.SpringCRUDAssignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    private List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userid}")
    private Optional<User> getUserById(@PathVariable("userid")int userId){
        return userService.getUserById(userId);
    }

    @DeleteMapping("/users/{userid}")
    private String deleteUserById(@PathVariable("userid")int userid){
        userService.delete(userid);
        return "Successfully Deleted: "+ userid;
    }

    @PostMapping("/users")
    private String saveUsers(@RequestBody User user){
        userService.saveOrUpdate(user);
        return "Successfully Inserted: "+ user.getName();
    }

    @PutMapping("/users")
    private User update(@RequestBody User user){
        userService.saveOrUpdate(user);
        return user;
    }


}
