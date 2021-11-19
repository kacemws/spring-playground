package com.usercrud.service;  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.usercrud.model.User;  
import com.usercrud.repository.UsersRepository;  
//defining the business logic  
@Service  
public class UserService   
{  
    @Autowired  
    UsersRepository usersRepository;  
    public List<User> getAllUsers()   
    {  
        List<User> users = new ArrayList<User>();  
        usersRepository.findAll().forEach(users1 -> users.add(users1));  
        return users;  
    }  
    public User getUsersById(int id)   
    {  
        return usersRepository.findById(id).get();  
    }  
    public void saveOrUpdate(User users)   
    {  
        usersRepository.save(users);  
    }  
    public void delete(int id)   
    {  
        usersRepository.deleteById(id);  
    }  

    public void update(User users, int userId)   
    {  
        usersRepository.save(users);  
    }  
}  