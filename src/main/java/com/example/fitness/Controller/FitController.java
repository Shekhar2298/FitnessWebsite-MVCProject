package com.example.fitness.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.fitness.Model.fitnessModel;

import com.example.fitness.Service.FitService;

@Controller

public class FitController {
    @Autowired
    FitService fitServ;

    @GetMapping("/")
    public String Index(Model model) {
        return "index";
    }

    @GetMapping("/home")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/homepg")
    public String Home() {
        // model.addAttribute("Emailid", fit.getEmailid());

        return "indexlogin";
    }

   
    @GetMapping("/homeyoga")
    public String HomeYoga() {
      

        return "yogalogin";
    }

    @GetMapping("/homemedi")
    public String HomeMedi() {


        return "meditationlogin";
    }

    @GetMapping("/homediet")
    public String HomeDiet() {


        return "dietlogin";
    }

    @GetMapping("/homeabout")
    public String HomeAbout() {


        return "aboutlogin";
    }

    @GetMapping("/join")

    public String Display() {
        return "signup";
    }

    @GetMapping("/forgotpassword")
    public String Forgotpassword() {
      

        return "forgotpwd";
    }
    
    @GetMapping("/forgotpswd")
    public String Forgotpswd() {
      

        return "forgotpwd";
    }


    @GetMapping("/datastore")
    public String Form(Model model) {
        List<fitnessModel> use = fitServ.AddAll();
        model.addAttribute("data", use);
        return "Database";

    }

    @PostMapping("/joindata")
    public String JoinNow(@ModelAttribute fitnessModel fit, Model model) {
        model.addAttribute("Name", fit.getName());
        fitServ.Add(fit);
        // System.out.println(fit);
        return "Homepage";
    }

    @GetMapping("/about")
    public String About() {
        return "About-us";
    }

    @GetMapping("/meditation")
    public String Meditation() {
        return "Meditation";
    }

    @GetMapping("/yoga")
    public String Yoga() {
        return "yoga";
    }

    @GetMapping("/diet")
    public String Diet() {
        return "Diet-plan";
    }

    @GetMapping("/update/{Emailid}")
    public String UdateByEmail(@PathVariable String Emailid, Model model) {
        fitnessModel u = fitServ.getByEmail(Emailid);
        model.addAttribute("updatedata", u);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute fitnessModel fit, Model model) {
        List<fitnessModel> use = fitServ.AddAll();
        model.addAttribute("data", use);
        model.addAttribute("updatedata", fit.getEmailid());
        fitServ.Add(fit);
        return "Database";
    }

    @GetMapping("/deletedata/{Emailid}")
    public String deletedt(@PathVariable String Emailid, Model model) {
        fitServ.delete(Emailid);
        model.addAttribute("data", fitServ.AddAll());
        return "Database";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String Emailid, @RequestParam String psw, @ModelAttribute fitnessModel fit,
            Model model) {
        fitnessModel user = fitServ.getByEmail(Emailid);

        // System.out.println(user);
        if (user != null && user.getPsw().equals(psw)) {
            // Login successful, redirect to a success page or the home page
            model.addAttribute("Emailid", fit.getEmailid());
            model.addAttribute("message", "Login successful!");
            return "indexlogin";
        } else {
            // Login failed, display an error message on the login page
            model.addAttribute("errorMessage", "Invalid username or password");
            return "/index";
        }
    }

}