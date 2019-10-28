package com.example.demo;

import com.example.demo.service.CabBookingService;
import com.example.demo.service.CabBookingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

// this makes the service available to the clients
@Configuration
public class Exporter {

    @Bean
    RemoteExporter RegisterRMIExporter(){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("CabBookingService");
        exporter.setServiceInterface(CabBookingService.class);
        exporter.setService(new CabBookingServiceImpl());
        return exporter;
    }
}
