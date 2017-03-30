package homeauto.core;

import homeauto.api.HouseFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class HouseFactoryImplTest {

    private HouseFactory houseFactory;

    @BeforeEach
    void setup() {
        this.houseFactory = new HouseFactoryImpl();
    }

    @Test
    void createHouse() {
        assertNotNull(houseFactory.createHouse());
    }

    @Test
    void createRoom() {
        assertNotNull(houseFactory.createRoom());
    }

    @Test
    void createCleaningRobot() {
        assertNotNull(houseFactory.createCleaningRobot());
    }

    @Test
    void createWindow() {
        assertNotNull(houseFactory.createWindow());
    }

    @Test
    void createDoor() {
        assertNotNull(houseFactory.createDoor());
    }

    @Test
    void createHeater() {
        assertNotNull(houseFactory.createHeater());
    }

    @Test
    void createCatFeeder() {
        assertNotNull(houseFactory.createCatFeeder());
    }

}