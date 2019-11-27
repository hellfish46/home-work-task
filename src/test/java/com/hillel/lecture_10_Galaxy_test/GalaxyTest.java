package com.hillel.lecture_10_Galaxy_test;

import com.hillel.lecture_10_galaxyTask.PlanetSystem;

public class GalaxyTest {
    public static void main(String[] args) {
        PlanetSystem sunSystem = new PlanetSystem("MilkyWay",21474836473232L, 8);
        sunSystem.getTime(); // Space method
        sunSystem.getGalaxyDiameter();//Galaxy method
        sunSystem.getGalaxyName();//Galaxy method
        System.out.println(sunSystem.buildOrederOfPlanets());
        sunSystem.SayHiFromClass();



    }
}
