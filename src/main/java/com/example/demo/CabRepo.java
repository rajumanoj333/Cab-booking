package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabRepo extends JpaRepository<Cab, String> {

    // Method to check login credentials
    Cab findByFullNameAndPassword(String fullName, String password);

}