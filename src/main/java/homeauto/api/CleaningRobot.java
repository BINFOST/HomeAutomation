package homeauto.api;


public interface CleaningRobot {
    /**
     * Returns the value of the Position reference.
     *
     * @return the value of the Position reference.
     */
    Room getPosition();

    /**
     * Sets the value of the Position reference.
     *
     * @param value the new value of the Position reference.
     */
    void setPosition(Room value);

    void pathToInitialRoom();

} // CleaningRobot
