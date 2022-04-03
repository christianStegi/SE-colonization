package src.main.scala.de.htwg.se.app
//import de.htwg.se.view.tui.*
//import src.main.scala.de.htwg.se.view.tui.Tui.*
import src.main.scala.de.htwg.se.view.tui.Tui


object Colonization:

    val boardsize_x: Int = 5
    val boardsize_y: Int = 5
    val nrOfPlayers: Int = 1

    def main(args: Array[String]): Unit = 
        
        

        println(Tui.printFirstGameField(boardsize_x, boardsize_y))

    
    def tryingStuff(): Int = 
        val a = List(1, 2, 3).map(i => i) 
        println("a: " + a)
        0


 
