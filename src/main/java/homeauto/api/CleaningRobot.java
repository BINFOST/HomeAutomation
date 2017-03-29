package homeauto.api;


public interface CleaningRobot {

    Room getPosition();

    void setPosition(Room room);

    void pathToInitialRoom();

} // CleaningRobot
