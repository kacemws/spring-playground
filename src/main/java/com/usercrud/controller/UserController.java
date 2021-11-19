package com.usercrud.controller;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.usercrud.model.User;  
import com.usercrud.service.UserService;  
@RestController  
public class UserController{  

    @Autowired  
    UserService userService;  

    @GetMapping("/user")  
    private List<User> getAllUsers()   
    {  
        return userService.getAllUsers();  
    }  

    @GetMapping("/user/{id}")  
    private User getUser(@PathVariable("id") int id)   
    {  
        return userService.getUsersById(id);  
    }  

    @DeleteMapping("/user/{id}")  
    private void deleteUser(@PathVariable("id") int id)   
    {  
        userService.delete(id);  
    }  

    @PostMapping("/user")  
    private int saveUser(@RequestBody User user)   
    {  
        userService.saveOrUpdate(user);  
        return user.getId();  
    }  

    @PutMapping("/user")  
    private User update(@RequestBody User user)   
    {  
        userService.saveOrUpdate(user);  
        return user;  
    }  
}  