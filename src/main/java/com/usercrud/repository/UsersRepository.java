package com.usercrud.repository;
import org.springframework.data.repository.CrudRepository;  
import com.usercrud.model.User;  

public interface UsersRepository extends CrudRepository<User, Integer>  {
    
}
