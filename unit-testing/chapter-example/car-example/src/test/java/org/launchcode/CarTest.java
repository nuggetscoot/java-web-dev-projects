package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    Car test_car;
    @BeforeEach
    public void createCarObject () {
        Car test_car = new Car("Toyota", "Supra", 15, 17.25);
    }
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void constructorCorrectlySetsFields () {
        assertEquals("Toyota", test_car.getMake());
    }

 //TODO: gasTankLevel is accurate after driving within tank range

    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    //TODO: can't have more gas than tank size, expect an exception

}