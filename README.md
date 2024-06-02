# Walk-Adventures
 Walk Adventures is a Java project where characters Ali and Hassan move across a grid, Ali's movements are user-controlled, Hassan's are randomized, both avoiding obstacles, and the program calculates their distances traveled.
Explanation:
This Java project consists of a simulated walking adventure where two characters, Ali and Hassan, move through a grid while encountering hurdles. The movement and distance calculations are handled by three classes: ControlledWalk, RandomWalk, and Hurdles.

Classes and Their Roles:
ControlledWalk:

This class allows Ali to move based on user input.
It initializes with Ali's name and sets the starting position.
The WalkC method reads user input to decide Ali's movement.
The Cdis method calculates the distance Ali has moved from the starting point.
RandomWalk:

This class allows Hassan to move randomly.
It initializes with Hassan's name and sets the starting position.
The WalkR method generates a random movement direction for Hassan.
The Rdis method calculates the distance Hassan has moved from the starting point.
Hurdles:

This class manages the positions and hurdles on the grid.
It contains static variables for the starting coordinates and methods to check for hurdles.
The movement method updates the position based on the move direction and checks for hurdles, reverting the move if a hurdle is encountered.
The WalkLoop method orchestrates the movement of both Ali and Hassan for a specified number of steps, updating their positions and calculating distances.
Walkmode (Main Class):

This class serves as the entry point for the program.
It prompts the user to enter the names of the two characters and the number of steps.
It creates instances of ControlledWalk and RandomWalk for Ali and Hassan, respectively.
It links these instances with the Hurdles class to manage their movements and executes the walking loop.
How it Works:
Initialization:

The program starts by asking for the names of the two characters.
It then asks for the number of steps the characters should move.
Movement:

Ali's movement is controlled by user input through the ControlledWalk class.
Hassan's movement is randomized through the RandomWalk class.
Hurdles:

Both characters may encounter hurdles during their movement. If they do, the program notifies and prevents them from moving into the hurdle.
Distance Calculation:

After all the steps are taken, the program calculates and displays the distance each character has moved from their starting position.
