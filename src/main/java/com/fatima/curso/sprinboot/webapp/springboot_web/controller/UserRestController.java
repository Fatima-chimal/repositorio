package com.fatima.curso.sprinboot.webapp.springboot_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatima.curso.sprinboot.webapp.springboot_web.models.User;
import com.fatima.curso.sprinboot.webapp.springboot_web.models.dto.UserDto;

//import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;//



@RestController 
@RequestMapping("/api")
public class UserRestController{ 

    @GetMapping (path="/details")
    public UserDto details(){

    UserDto userDto = new UserDto();
    User user = new User("fatima", "dzib");

    userDto.setUser(user);
    userDto.setTitle("Hola mundo spring boot");
    return userDto;
    }

  @GetMapping("/list")
    public List<User> list(){
      
      User user = new User("fatima", "dzib");
      User user2 = new User("concepciona", "dzib");
      User user3 = new User("fabiola", "chimal");

      List<User> users =new ArrayList<>();
      users.add(user);
      users.add(user2);
      users.add(user3);

      return users;


    }
 
    @GetMapping (path="/details-map")
    public Map<String,Object> detailsMap(){
      
      User user = new User("fatima", "dzib");

      Map<String, Object> body = new HashMap<>();
       body.put("title", "Hola mundo spring boot");
       body.put("user", user);

      return body;
    }
}    