package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabService {

    @Autowired
    private CabRepo repo;

    // Handle user login
    public Cab loginCheck(String fullName, String password) {
        return repo.findByFullNameAndPassword(fullName, password);
    }

    // Register a new user
    public Cab registerUser(Cab cab) {
        return repo.save(cab);
    }

    // Save booking details
    public Cab saveBooking(Cab cab) {
        Optional<Cab> existingUser = repo.findById(cab.getEmail());
        if (existingUser.isPresent()) {
            Cab existingCab = existingUser.get();
            existingCab.setLocation(cab.getLocation());
            existingCab.setDestination(cab.getDestination());
            existingCab.setCarType(cab.getCarType());
            existingCab.setDistance(cab.getDistance());
            existingCab.setFare(cab.getFare());
            return repo.save(existingCab);
        } else {
            throw new RuntimeException("User not found with email: " + cab.getEmail());
        }
    }
}