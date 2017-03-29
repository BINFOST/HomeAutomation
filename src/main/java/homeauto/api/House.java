package homeauto.api;

import java.util.List;


public interface House {

    String getName();

    void setName(String value);


    List<Room> getRooms();


    List<CleaningRobot> getDomesticRobots();


    int getTemperatureSensor();


    void setTemperatureSensor(int value);


    void globalClose();


    void globalOpen();


    void presenceGoOutsideEvent();

} // House
