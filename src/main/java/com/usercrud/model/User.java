package com.usercrud.model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class User  
{  
    @Id  
    @Column  
    private int id;  

    @Column  
    private String firstName;  

    @Column  
    private String lastName;  


    public int getId()   
    {  
        return id;  
    }  
    public void setId(int id)   
    {  
        this.id = id;  
    }  


    public String getFirstName()  
    {  
        return firstName;  
    }  
    public void setFirstName(String firstName)   
    {  
        this.firstName = firstName;  
    }  



    public String getLastName()   
    {  
        return lastName;  
    }  
    public void setLastName(String lastName)   
    {  
        this.lastName = lastName;  
    }  
    
}  

