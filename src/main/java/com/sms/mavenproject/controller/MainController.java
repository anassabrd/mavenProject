/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.mavenproject.controller;

/**
 *
 * @author lenovo
 */
import com.sms.mavenproject.models.User;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @Autowired
    User user;
    
    ArrayList<User> users = new ArrayList<User>();
    User user1 = new User(1, "user1", "user1", "52vw2dgq45rf", "");
    User user2 = new User(2, "user2", "user2", "wb2DD5sed", "");
    User user3 = new User(3, "user3", "user3", "5g4stg8fg", "");
    User user4 = new User(4, "user4", "user4", "bs8b4s", "");
    
    
    @RequestMapping(value="/testConnection/{usernameRecieved}/{passwordRecieved}", method = RequestMethod.GET)
    public User testConnection(@PathVariable String usernameRecieved, @PathVariable String passwordRecieved){
        
        
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        
        User user = new User();
        
        for(int i=0; i<users.size() ; i++){
            if(usernameRecieved.equals(users.get(i).getUser())){
                if(passwordRecieved.equals(users.get(i).getPassword())){
                    user = users.get(i);
                break;
                }
            }
        }
        return user;
    }
}
