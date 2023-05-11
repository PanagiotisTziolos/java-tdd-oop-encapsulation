package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Dynamics {
    private double position;
    private double velocity;
    private String direction;
    private List<String> allowedDirections;

    public Dynamics(double position, double velocity, String direction) {
        this.position = position;
        this.velocity = 0;
        this.direction = direction;
        this.allowedDirections = new ArrayList<>() {
            {
                add("Straight");
                add("Left");
                add("Right");
            }
        };
    }

    public double move(int distance) {
        position += distance;

        return position;
    }

    public double stop() {
        velocity = 0;

        return velocity;
    }

    public boolean changeDirection(String direction) {
        if (this.direction.equals(direction)) return false;
        if (!allowedDirections.contains(direction))
            return false;

        this.direction = direction;
        return true;
    }
}
