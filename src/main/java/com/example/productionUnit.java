package com.example;


import org.eclipse.microprofile.reactive.messaging.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class productionUnit {
    @Inject
    @Channel("production-output")
    Emitter<car> carEmitter;

    public void produceCars(car car) {
        // Simuler la production de voitures
        for (int i = 0; i < 10; i++) {
            carEmitter.send(car);
            try {
                Thread.sleep(car.getProductionTimeInSeconds() * 1000); // Simulation du temps de production
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}