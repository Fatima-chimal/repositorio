package com.fatima.curso.sprinboot.webapp.springboot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.fatima.curso.sprinboot.webapp.springboot_web.models.User;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import org.springframework.web.bind.annotation.RequestParam;




@Controller 
public class UserController{

    @GetMapping ("/details")
    public String details(Model model){

        User user = new User("fatima", "dzib");
        user.setEmail("fatidzib08@gmail.com");
       model.addAttribute("title", "Hola mundo spring boot");
       model.addAttribute("user", user);
       return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
      model.addAttribute("title","Listado de usuarios!!");
        return "list";
    }
    

    @ModelAttribute("users")
    public List <User> userModel() {
      List<User> users = Arrays.asList(
      new User("Pepa","Gonzales","pepa@gmail.com"),
      new User("Lalo","Perez"),
      new User("Juanita","Roe","juana@gmail.com"),
      new User("Andres","Doe"));
        return users;
    }
    }

 