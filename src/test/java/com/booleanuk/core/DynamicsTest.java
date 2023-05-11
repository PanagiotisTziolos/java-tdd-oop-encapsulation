package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicsTest {
    @Test
    public void testMove() {
        Dynamics d = new Dynamics(0.0, 20.0, "Straight");

        double r1 = d.move(10);
        Assertions.assertEquals(10, r1);

        double r2 = d.move(-20);
        Assertions.assertEquals(-10, r2);
    }

    @Test
    public void testStop() {
        Dynamics d = new Dynamics(0.0, 20.0, "Straight");

        double r1 = d.stop();
        Assertions.assertEquals(0, r1);
    }

    @Test
    public void testDirection() {
        Dynamics d = new Dynamics(0.0, 20.0, "Straight");

        boolean r1 = d.changeDirection("Straight");
        Assertions.assertFalse(r1);

        boolean r2 = d.changeDirection("Left");
        Assertions.assertTrue(r2);

        boolean r3 = d.changeDirection("Left");
        Assertions.assertFalse(r3);

        boolean r4 = d.changeDirection("Right");
        Assertions.assertTrue(r4);
    }
}
