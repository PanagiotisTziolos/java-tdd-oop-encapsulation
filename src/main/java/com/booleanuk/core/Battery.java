package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Battery {
    private String type;
    private int percentage;
    private List<String> allowedTypes;

    public Battery(String type, int percentage) {
        this.type = type;
        this.percentage = percentage;
        allowedTypes = new ArrayList<>() {
            {
                add("Rechargeable");
                add("Disposable");
            }
        };
    }

    public int percentage() {
        return percentage;
    }

    public boolean replace(String type) {
        if (this.type.equals(type)) return false;

        if (!allowedTypes.contains(type)) return false;

        this.type = type;

        return true;
    }
}
