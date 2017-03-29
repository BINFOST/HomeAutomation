package homeauto.api;

import java.util.List;

public interface Room {

    List<Window> getWindows();


    List<Door> getDoors();


    List<Heater> getHeaters();


    List<Room> getConnections();


    String getName();


    void setName(String name);


    boolean isLight();


    void setLight(boolean on);


    CatFeeder getCatFeeders();


    void setCatFeeders(CatFeeder feeder);


    void closeWindows();

}
