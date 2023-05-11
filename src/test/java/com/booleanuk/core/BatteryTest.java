package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BatteryTest {
    @Test
    public void testPercentage() {
        Battery b = new Battery("Rechargable", 100);
        Assertions.assertEquals(100, b.percentage());

        Battery b2 = new Battery("Rechargable", 10);
        Assertions.assertEquals(10, b2.percentage());

        Battery b3 = new Battery("Rechargable", 94);
        Assertions.assertEquals(94, b3.percentage());
    }

    @Test
    public void testReplace() {
        Battery b = new Battery("Rechargeable", 100);

        boolean r1 = b.replace("Rechargeable");
        Assertions.assertFalse(r1);

        boolean r2 = b.replace("Disposable");
        Assertions.assertTrue(r2);

        boolean r3 = b.replace("123");
        Assertions.assertFalse(r3);
    }
}
