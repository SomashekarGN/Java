package com.xworkz.singleton.dto;

public class ContinentDTO {

    private String continentName;
    private int noOfCounties;
    private double areaInSqKm;
    private String location;

    public ContinentDTO() {
        System.out.println("Continent Const Invoked");
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getNoOfCounties() {
        return noOfCounties;
    }

    public void setNoOfCounties(int noOfCounties) {
        this.noOfCounties = noOfCounties;
    }

    public double getAreaInSqKm() {
        return areaInSqKm;
    }

    public void setAreaInSqKm(double areaInSqKm) {
        this.areaInSqKm = areaInSqKm;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ContinentDTO{" +
                "continentName='" + continentName + '\'' +
                ", noOfCounties=" + noOfCounties +
                ", areaInSqKm=" + areaInSqKm +
                ", location='" + location + '\'' +
                '}';
    }
}
