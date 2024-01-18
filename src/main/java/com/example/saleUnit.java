package com.example;
import org.eclipse.microprofile.reactive.messaging.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class saleUnit {
    @Inject
    @Channel("sales-output")
    Emitter<String> salesEmitter;

    // envoyer une notification de vente
    public void notifySale(String model) {
        salesEmitter.send(model);
    }
}
