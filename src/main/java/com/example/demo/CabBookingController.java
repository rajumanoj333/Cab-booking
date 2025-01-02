package com.example.demo;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CabBookingController {

    @Autowired
    private CabService service;

    Logger log = Logger.getAnonymousLogger();

    @ResponseBody
    @RequestMapping("/book/{fullName}/{password}/{email}/{phoneNumber}/{location}/{destination}/{carType}/{distance}")
    public String bookCab(
            @PathVariable("fullName") String fullName,
            @PathVariable("password") String password,
            @PathVariable("email") String email,
            @PathVariable("phoneNumber") String phoneNumber,
            @PathVariable("location") String location,
            @PathVariable("destination") String destination,
            @PathVariable("carType") String carType,
            @PathVariable("distance") int distance) {

        // Calculate fare
        int fare = distance * 2;

        // Create and populate Cab object
        Cab cab = new Cab();
        cab.setFullName(fullName);
        cab.setPassword(password);
        cab.setEmail(email);
        cab.setPhoneNumber(phoneNumber);
        cab.setLocation(location);
        cab.setDestination(destination);
        cab.setCarType(carType);
        cab.setDistance(distance);
        cab.setFare(fare);

        // Save booking details using service
        service.saveBooking(cab);

        log.info("Cab booking successful for: " + fullName + ", From: " + location + ", To: " + destination);
        return "Booking successful for " + fullName + ". From: " + location + ", To: " + destination + ". Fare: Rs." + fare;
    }
}