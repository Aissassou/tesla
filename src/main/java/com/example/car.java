package com.example;

public class car {
    private String model;
    private int productionTimeInSeconds;
public car (String x,int y){
    this.model=x;
    this.productionTimeInSeconds=y;
}
    protected void setModel(String m) {
        this.model=m;
    }

    protected void setProductionTimeInSeconds(int i) {
        this.productionTimeInSeconds=i;
    }

    public int getProductionTimeInSeconds() {
        return this.productionTimeInSeconds;
    }

    public String getModel() {
        return this.model;
    }
}
