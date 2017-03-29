package homeauto.api;

import java.util.List;

public interface Room {

    List<Window> getWindows();


    List<Door> getDoors();


    List<Heater> getHeaters();


    List<Room> getConnections();


    String getName();


    void setName(String value);


    boolean isLight();


    void setLight(boolean value);


    CatFeeder getCatFeeders();


    void setCatFeeders(CatFeeder value);


    void closeWindows();

} // Room
