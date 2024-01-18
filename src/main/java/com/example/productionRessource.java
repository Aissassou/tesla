package com.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

public class productionRessource {
    @Inject
    productionUnit productionUnit;
    @POST
    public Response produceCar(@QueryParam("model") String model) {
        car car;
        switch (model.toUpperCase()) {
            case "M":
                car = new car("M",10);
                break;
            case "I":
                car = new car("I",2);
                break;
            case "A":
                car = new car("A",3);
                break;
            case "G":
                car = new car("G",4);
                break;
            case "E":
                car = new car("E",7);
                break;
            default:
                return Response.status(Response.Status.BAD_REQUEST).entity("Invalid car model").build();
        }

        productionUnit.produceCars(car);
        return Response.status(Response.Status.OK).entity("Production of " + model + " cars started.").build();
    }
}