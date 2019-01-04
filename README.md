# Advanced Object Oriented Programming Project 2018

----------

- Author: Michael Kidd
- Student Number: G00236920

----------

## Introduction to the Game
----------
The game and game play is very simple, you start at one side of the map. There are 4 chests in the game and if you walk up to each one, you can collect them, when all the chests have been collected the game will end along with the program, after you receive a message stating that you have completed the game. The game may not be very exiting but as the purpose of the project was more about the design patterns used and demonstration of an ability to abstract the objects and interfaces, I believe this to be acceptable.

----------

## Features
----------
Features that exist due to the change in game design.
- The player can no longer walk off the grid
- The player can also no longer walk onto a tile that has an object present
- Images are loaded only once and reused as many times as needed
- More tiles can be added by adding files to the resources folder, then added to the the tile Type class.
- With sprite types, they must also be added to the spriteFactory class.


## Design Patterns Used
----------

#### Factory Pattern
----------
The Factory pattern is used to create sprites within the game, this can be a player or an enemy. Currently there are 4 character sprite types within the game. A standard player, a knight, a green man and a person sprite. The factory design pattern means that the program can simply state that it wants a sprite and then feed a parameter of the type and it will have that object returned.


#### Builder Pattern
----------
The builder pattern is used to create any of the tiles within the game, by using the Groundbuilder, item builder and SpriteBuilder classes. This means that instead of using the constructors assigned to these objects, the objects themselves can be created using the builder and can be build as needed, so that all parameters for example would not be needed and multiple constructors would not be needed as you may have many variables or possible variables assigned to that object. The spritebuilder as mentioned can be accessed using the spritefactory also.


#### Singleton Pattern
----------
The Singleton pattern is used with the Game window class, it allows for only one instance of the GameWindow class to exist and would remove and further instances if creation of another was to be attempted. This means that any variables relative to this class would belong to and exist only within the scope of this class, and there can only ever be one of this class.

#### Iterator Pattern 
-----------
The iterator pattern is used for image loading within the imageloaderImpl class and is accessed through the imageloader interface. In the program this is used to load each of the image files in the resource folder, the iterator is returned and then used to give each of the tiles an image and in some cases a state, by using enums associated with the object type. For example the GroundType has a type for each possible ground tile that can be created and by using the enums to store the state and image, then the images only need to be loaded once, the state would also be a default so that any further request for this object type would instantiate with that same state, unless told otherwise by the associated builder.

