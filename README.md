# SE-colonization
a game for the lecture "Software Engineering" at HTWG Konstanz, Germany

# About This Project

This repository is used for building a game for a lecture in software-engineering. It's numbered branches should represent different states of the complexity of its code progressing from a very simple implementation to more complex versions with more concepts of programming implemented. There hopefully might be other branches that further enhance the functionality of the game and add more than needed for the lecture. 

I hope that the project will continue to grow and I plan on adding functionality step by step over time. But let's see. So don't expect a perfectly playable game here ;)

# About The Game Itself

This is meant to be a scala implementation of the nineties-game "Sid Meyer's Colonization". The game was very successful back then and has reached the status of a classic over the years. It is loved by many for its charming simplicity in game design and grafics, as well as a pleasant, relaxed gameplay experience not putting the player in a stressed mood as it is a round based game and there is no need to hurry at all.

Still, the old version had some bugs and limitations. For example, you could not have many saved sessions (only 10), you can't mark several units at once, the number of colonies, settlers etc. are limited and so on. So at some point of the game, you might get stuck. This implementations tries to overcome these things.

# Different Versions Of The Game

It is planned to offer some different playable versions of the game:

"old-style" versions:

- a simple copy of the original version 
    (including all limitations, but hopefully not the bugs)
- a copy of the original version, but without any limitions on the number of units etc.

"new functionality" versions:

- the game should be playable with the classic grafics as well as with a grafically     enhanced version.
- an advanced version of the game

    more advanced options might be:
        more settler types
        more mechanisms for settler to gain experience and on a more fine-grained level
        more types of 
            military
            buildings in colonies
            colonies
            helper-settlements 
                trade-related
                    ware-houses
                    special-purpose settlements
                    ...
                military buildings
                    control-tower
                    shooting-towers
                    military bases
                    naval bases
                    ...
            transportation
            stockmarket-options
        improved gameplay
            marking and controlling several units at once
            better auto-route function
            better automatisation of settler-activities and economic activities
        improved managment of colonies
        improved game-options
            user should be able to select the single advanced options he wants to be able to use before starting the game.
        more nations to choose from


----------------------------------------------------------------
MANUAL FOR PLAYING
----------------------------------------------------------------

# how to run the game
# game story
# how to win the game
# rules of the game

----------------------------------------------------------------
START MENU
----------------------------------------------------------------

At the beginning of the game, you should be able to configure your game the way you want to play it.

# Options to choose from

- number of players
- level of difficulty
- nation to play game with
- starting cash
- number of units to start with

----------------------------------------------------------------
WHILE GAMING
----------------------------------------------------------------

ability to cheat every value
    years
    money
    units
    values of opponents (money, units, ...)
    ...

change grafics in game
    old-style
    different new-styles

ability to add code and recompile while playing

----------------------------------------------------------------

