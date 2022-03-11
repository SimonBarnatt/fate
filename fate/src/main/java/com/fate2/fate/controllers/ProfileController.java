package com.fate2.fate.controllers;

import com.fate2.fate.dao.ProfileRepository;
import com.fate2.fate.entities.Bio;
import com.fate2.fate.entities.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    @RequestMapping(value="/createNewProfile", method=RequestMethod.POST)
    public String createNewProfile(Profile newProfile, Model model)   
    {
        updateProfile(newProfile);
        Profile profile = getProfile(newProfile.getUserIdNumber());
        model.addAttribute("userIdNumber", profile.getUserIdNumber());
        model.addAttribute("bio", new Bio(profile.getUserIdNumber()));
        return "profile/editBio";        
    }
    @RequestMapping(value = "/editBio", method = RequestMethod.POST)
    public String editBio(Bio bio, Model model)
    {
        Profile profile=getProfile(bio.getUserId());
        profile.setBio(bio.getBio());
        updateProfile(profile);
        long userId=profile.getUserIdNumber();
        model.addAttribute("userId", userId);
        return "redirect:loadProfile";
        // return loadProfile(userId);
    }

    private void updateProfile(Profile profile)
    {
        profileRepository.save(profile);
    }

    private Profile getProfile(Long userId)
    {
        return profileRepository.findById(userId).get();
    }

    @RequestMapping(value="/loadProfile", method = RequestMethod.GET)
    public String loadProfile(Model model)
    {
        Profile profile=getProfile((Long)model.getAttribute("userId"));    
        model.addAttribute("profile", profile);
        return "login/welcomeNewUser"; 
    }
}
