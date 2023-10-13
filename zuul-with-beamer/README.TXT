Project: zuul-with-player
Authors: Michael Kolling and David J. Barnes
Modified by: Poul Henriksen (2005)

This project is supplementary material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Second edition
   David J. Barnes and Michael Kolling
   Pearson Education, 2004
  
This project is a further enhancement of zuul-with-timelimit.
This version also includes a beamer as suggested in exercise 7.37.

A new class (Player) is created to hold information and functionality 
related to the player like name, current room, etc. 

The player can pick up and drop items. 
There is a maximum weight that the player can carry.
If the player eats a magic cookie the maximum weight the player can carry is
increased.
If the user has not reached the Computing Admin. within 6 moves the game is terminated.
The user has a beamer. When you charge a beamer it memorizes the current room. 
When you fire the beamer, it transports you immediately back to the room it was
 charged in.