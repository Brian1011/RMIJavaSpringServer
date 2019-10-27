package com.example.demo.service;

import org.springframework.context.annotation.Bean;

public class CabBookingServiceImpl implements CabBookingService {

    @Override
    public String bookCab(String pickupLocation) {
        System.out.println("############## RMI SERVER IS RUNNING #############");
        System.out.println(" from client message is: "+pickupLocation);
        return "Your have selected your pickup station as "+pickupLocation;
    }
}
