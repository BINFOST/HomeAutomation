# Practical Session of Software Testing

## TP2 : Home automation Code Coverage
***


A House consists of Rooms. 
Rooms can be connected to other rooms. 
Each room can have several External Doors and several Windows that can be opened or closed.
A presence sensor will tell us if there is some person in the house. 
A temperature sensor will tell us the external temperature in Celsius as an integer value. 
A room could have one or more heaters. 
A house could have several automatic cleaning robots. 

**closeWindows**: Each room has a physical button that calls the _closeWindows_ method that will close all the windows of the room.

**presenceGoOutsideEvent**: The method must switch off the lights of all the rooms.

**globalOpen**: The house must have a _globalOpen_ method that will open all the doors and windows of the house. It will return true once it was executed successfully. This method is normally called in case of emergency so for safety reasons the timeout to finish the operation is 2 seconds.

**globalClose**: The house must have a _globalClose_ method that will close all the doors and windows. If the house has a presence sensor the doors and windows will be closed only in the case that there is no presence in the house. It will return true once it was executed successfully or false in case that there were presence in the house.

**adjustHeating**: The Heater have a physical button to adjust automatically the temperature. The _adjustHeating_ method must take the value of the temperatureSensor of the house and must automatically set the temperature of the heater based on the following rules:

* Less than 10 (inclusive) of external temperature --> 25
* From 11 to 25 (inclusive) of external temperature --> 20
* Greater than 26 (inclusive) of external temperature --> 15

**pathToInitialRoom**: The cleaning robot must have a _pathToInitialRoom_ method that returns the path that the robot is going to follow to go to the first room of the house (the first room of the house is the first Room in the rooms list of the house). A Robot cannot go outside the house nor break the walls so it will return null if the initial room cannot be reached. The method must return the shortest possible path.

**feed**: A room could have one automatic cat feeder. The CatFeeder must have a _feed_ method and a tankItems counter. This method, if the tank is empty returns -1, if everything was ok returns 0 and decrease the tankItems counter, if the feed method was already called less than 3 seconds ago then returns -2. This third case is to avoid several calls by mistake that could overfeed the cat.



There is also a Factory to create instances of the house related classes. This is an example of creating a house and adding a room to it.

    House house = HouseFactoryImpl.createHouse();
    Room room = HouseFactoryImpl.createRoom();
    house.getRooms().add(room);


### Exercises

* Create Unit tests for all the requirements and create a TestSuite. Justify the design decisions of the Tests.

* Imagine a new functionality of the House then create a specification that could serve as oracle and provide test cases to test it. Add these tests to the Test suite. Explain and justify the test cases.

* Implement the production code (except the _pathToInitialRoom_ method) and check that all tests on the Test Suite are passed (except the pathToInitialRoom method tests). 

* Create screenshots of the Control Flow Graphs of all the production code implemented in previous point. (Using Source Code Visualizer).

* Create and export the report of the coverage of the TestSuite. Discuss the global coverage of instructions, branches, lines and methods of the whole project. Discuss the coverage of a class of your selection. 
