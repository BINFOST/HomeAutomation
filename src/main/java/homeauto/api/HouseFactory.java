package homeauto.api;


public interface HouseFactory {

    House createHouse();

    Room createRoom();

    CleaningRobot createCleaningRobot();

    Window createWindow();

    Door createDoor();

    Heater createHeater();

    CatFeeder createCatFeeder();
}
