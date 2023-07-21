package com.example.fitness.Repository;

import org.springframework.stereotype.Repository;

import com.example.fitness.Model.fitnessModel;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface fitnessRepo extends JpaRepository<fitnessModel, String> {



    //Optional<fitnessModel> findByUsername(String Emailid);
    // fitnessModel findByUsernameAndPassword(String Emailid, String psw);
   //  fitnessModel findByUsername(String username);
    // fitnessModel findByUsername(String Emailid);

    // fitnessModel findByUsername(String emailid);

    // fitnessModel findByEmail(String email);

}
