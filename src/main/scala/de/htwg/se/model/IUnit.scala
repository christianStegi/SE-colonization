package de.htwg.se.model

import de.htwg.se.model.util.Direction

trait IUnit:

    def posX: Int
    def posY: Int
    def move(dir: Direction): (Int, Int)
    def hasMovesLeft: Boolean


 

/* wie soll das mit den Units funktionieren?:

in Klasse model.Unit (nur Daten?)

posX: Int
posY: Int
maxMoves: Int
movesLeft: Int
lastMovedInYear: Int


Sammlung von Eigenschaften von Units:

    Siedertyp
    experienced bzw. experience


    */