package homeauto.api;

import java.util.List;


public interface House {

    String getName();

    void setName(String name);


    List<Room> getRooms();


    List<CleaningRobot> getDomesticRobots();


    int getTemperatureSensor();


    void setTemperatureSensor(int temperature);


    void globalClose();


    void globalOpen();


    void presenceGoOutsideEvent();

}
