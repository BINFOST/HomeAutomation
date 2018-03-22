# Practical Session of Software Testing

# TP2 : Home automation Code Coverage

## Information

Release a new version of your work per part completed. Answers can be put in a word, txt or markdown document and then commit in the [doc/] folder.

Please add your name, id and mail in the pom.xml in the developers section!

*Deadline P1*: 8th April 2017 23:59:59 (GMT +2)
*Deadline P2*: 16th April 2017 23:59:59 (GMT +2)

## Instructions

A House consists of Rooms. 
Rooms can be connected to other rooms. 
Each room can have several External Doors and several Windows that can be opened or closed.
A presence sensor will tell us if there is some person in the house. 
A temperature sensor will tell us the external temperature in Celsius as an integer value. 
A room could have one or more heaters. 
A house could have several automatic cleaning robots. 

The main method are : 

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


In this practical session, the goal will be to apply a methodology called TDD, Test Driven Development. This methodology consist in writing the test first and then the actual code of an application.

In the context of the following project, the Application Programming Interface (API) is given in the [src/main/java/homeAuto/api] and you can start to write some test about the desired behaviour of your implementation.

### First Part

Thus, you will first create Unit tests for all the requirements and justify Justify the design decisions of your Tests.

Test should be put in [src/test/java/homeauto/core/]

One test class should be created per class. 

Imagine a new functionality of the House then create a specification that could serve as oracle and provide test cases to test it. Explain and justify the test cases.

### Second Part

Implement the production code in the  [src/main/java/homeauto/core/] folder and check that all your tests pass 

You are not forced to implement  _pathToInitialRoom_ method, however if you do it will give you bonus points :)

In this project a dependency to a code coverage tool was added, run mvn install once and go in the target folder, then site and then jacoco-ut. You should find a index.html file, open it in your browser, it should print the coverage information of your test suite.
 Discuss the global coverage of instructions, branches, lines and methods of your project and then discuss the coverage of a class of your choice. 

### Third Part (Bonus)

Try to tune your coverage score. Explain what was required to improve your coverage.


