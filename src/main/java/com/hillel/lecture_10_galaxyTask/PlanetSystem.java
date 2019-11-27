package com.hillel.lecture_10_galaxyTask;

public class PlanetSystem extends Galaxy {
    private int countOfPlanet;

    public PlanetSystem(String galaxyName, long galaxyDiameter, int countOfPlanet) {
        super(galaxyName, galaxyDiameter);
        this.countOfPlanet = countOfPlanet;
    }

    public String buildOrederOfPlanets(){
        String order = "";
        for (int i = 1; i <= countOfPlanet; i++) {
            order = order + i + " ";
        }
        return order;
    }
}
