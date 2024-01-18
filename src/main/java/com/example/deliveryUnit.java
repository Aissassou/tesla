package com.example;


import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class deliveryUnit {
    @Incoming("production-output")
    public void receiveCar(car car) {

        try {
            Thread.sleep(2000); // Simulation du temps de livraison
            System.out.println("Car model " + car.getModel() + " delivered.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
