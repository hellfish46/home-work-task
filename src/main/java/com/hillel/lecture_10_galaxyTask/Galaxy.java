package com.hillel.lecture_10_galaxyTask;

public class Galaxy extends Space {
    private String galaxyName;
    private long galaxyDiameter;

    public Galaxy(String galaxyName, long galaxyDiameter) {
        this.galaxyName = galaxyName;
        this.galaxyDiameter = galaxyDiameter;
    }

    public void getGalaxyName() {
        System.out.println(galaxyName);
    }

    public void getGalaxyDiameter() {
        System.out.println(galaxyDiameter);
    }

    @Override
    public void SayHiFromClass() {
        System.out.println("Hi form Galaxy");
    }
}
