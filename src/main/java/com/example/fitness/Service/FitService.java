package com.example.fitness.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fitness.Model.fitnessModel;
//import com.example.fitness.Model.fitnessModel.LoginResult;
import com.example.fitness.Repository.fitnessRepo;

@Service
public class FitService {

    @Autowired
    fitnessRepo fitRepo;

    public void Add(fitnessModel dt) {
        fitRepo.save(dt);
    }

    public List<fitnessModel> AddAll() {
        return fitRepo.findAll();
    }

    public void delete(String Emailid) {
        fitRepo.deleteById(Emailid);
    }

    public fitnessModel getByEmail(String Emailid) {
        Optional<fitnessModel> table = fitRepo.findById(Emailid);
        if (table.isPresent()) {
            return table.get();

        } else {
            return null;
        }
    }


   

    // public String login(String username, String password) {
    //     Optional<fitnessModel> optionalUser = fitRepo.findByUsername(username);

    //     if (optionalUser.isPresent()) {
    //         fitnessModel user = optionalUser.get();
    //         if (user.getPsw().equals(password)) {
    //             // Login successful
    //             return "Login successful!";
    //         } else {
    //             // Incorrect password
    //             return "Incorrect password!";
    //         }
    //     } else {
    //         // User not found
    //         return "User not found!";
    //     }
    // }

    // public boolean check(String Emailid,String psw){
    // Optional<fitnessModel> exist=fitRepo.findById(Emailid);
    // if(exist.isPresent()){
    // return exist.get();
    // }
    // }

    // public fitnessModel findByUsername(String username) {
    // return null;
    // }

    // public LoginResult login(String Emailid, String psw) {
    // fitnessModel user = fitRepo.findByUsername(Emailid);
    // if (user != null && user.getPsw().equals(psw)) {
    // return LoginResult.SUCCESS;
    // } else if (user == null) {
    // return LoginResult.USER_NOT_FOUND;
    // } else {
    // return LoginResult.INVALID_PASSWORD;
    // }
    // }

    // public List<fitnessModel> gets(fitnessModel fits) {
    // return fitRepo.findAll();
    // }

}
