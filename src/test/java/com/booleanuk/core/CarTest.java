package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    public Car car() {
        return new Car(
                "black",
                    new Battery(
                        "Rechargeable",
                        100
                    ),
                    new Dynamics(
                        0.0,
                        20.0,
                        "Straight"
                    ),
                    "simple"
                );
    }
    @Test
    public void testPaint() {
        Car c = car();

        Assertions.assertEquals("black", c.paint("black"));
        Assertions.assertEquals("black", c.paint("black"));
        Assertions.assertEquals("red", c.paint("red"));
    }

    @Test
    public void testMove() {
        Car c = car();

        Assertions.assertEquals(10, c.move("Straight", 10));
        Assertions.assertEquals(20, c.move("Straight", 10));
        Assertions.assertEquals(20, c.move("Straight", 0));
        Assertions.assertEquals(0, c.move("Straight", -20));
    }

    @Test
    public void testStop() {
        Car c = car();

        Assertions.assertEquals(0, c.stop());
    }

    @Test
    public void testRemainingBattery() {
        Car c = car();

        Assertions.assertEquals(100, c.remainingBattery());
    }

    @Test
    public void testReplaceBattery() {
        Car c = car();

        Assertions.assertFalse(c.replaceBattery("123"));
        Assertions.assertTrue(c.replaceBattery("Disposable"));
    }

    @Test
    public void testChangeRemoteControl() {
        Car c = car();

        Assertions.assertFalse(c.changeRemoteControl("simple"));
        Assertions.assertTrue(c.changeRemoteControl("Advanced"));
    }
}
