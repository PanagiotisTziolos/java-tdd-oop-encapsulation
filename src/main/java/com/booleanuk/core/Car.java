package com.booleanuk.core;

import java.util.ArrayList;

public class Car {
    private String colour;
    private Battery battery;
    private String removeControl;
    private Dynamics dynamics;
    private final ArrayList<String> allowedRemoteControls;

    public Car(String colour, Battery battery, Dynamics dynamics, String remoteControl) {
        this.colour = colour;
        this.battery = battery;
        this.dynamics = dynamics;
        this.removeControl = remoteControl;
        this.allowedRemoteControls = new ArrayList<>() {
            {
                add("simple");
                add("advanced");
            }
        };
    }

    public String paint(String colour) {
        this.colour = colour;

        return this.colour;
    }

    public double move(String direction, int distance) {
        dynamics.changeDirection(direction);

        return this.dynamics.move(distance);
    }

    public double stop() {
        return this.dynamics.stop();
    }

    public double remainingBattery() {
        return this.battery.percentage();
    }

    public boolean replaceBattery(String type) {
        return this.battery.replace(type);
    }

    public boolean changeRemoteControl(String type) {
        if (this.removeControl.equals(type.toLowerCase())) return false;
        if (!this.allowedRemoteControls.contains(type.toLowerCase())) return false;

        this.removeControl = type;
        return true;
    }
}
