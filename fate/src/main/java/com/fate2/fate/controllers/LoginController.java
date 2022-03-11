package com.fate2.fate.controllers;

import com.fate2.fate.dao.UserRepository;
import com.fate2.fate.entities.Profile;
import com.fate2.fate.entities.User;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//@RestController //used when not expecting any external web/html files
@Controller
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/newSignUpForm")
    public String newUserSignUp(Model model)
    {
        model.addAttribute("newUser",new User());
        return "login/signup";
    }

    @RequestMapping(value="/saveNewSignUp", method=RequestMethod.POST)
    public String createNewProfile(User newUser, Model model)    
    {
        userRepository.save(newUser);
        long userId=newUser.getUserIdNumber();
        model.addAttribute("userId", userId);
        model.addAttribute("newProfile", new Profile(userId));
        return "profile/createProfile";      
    }

    @RequestMapping("/SignInForm")
    public String signIn(Model model)
    {
        model.addAttribute("user", new User());
        return "login/signIn";
    }

    @RequestMapping(value="/signUserIn", method = RequestMethod.POST)
    public String signUserIn(User user, Model model)
    {
        long userId=userRepository.getUserByLoginDetails(user.getEmail(), user.getPassword());
        model.addAttribute("userId", userId);
        return "redirect:localhost:8080/profile/loadProfile";
    }


}
