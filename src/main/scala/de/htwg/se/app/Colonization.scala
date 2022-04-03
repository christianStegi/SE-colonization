package src.main.scala.de.htwg.se.app
//import de.htwg.se.view.tui.*
//import src.main.scala.de.htwg.se.view.tui.Tui.*
import src.main.scala.de.htwg.se.view.tui.Tui


object Colonization:

    def double(i: Int): Int = i * 2

    def main(args: Array[String]): Unit = 

        println(Tui.printFirstGameField())

    
    def tryingStuff(): Int = 
        val a = List(1, 2, 3).map(i => double(i)) 
        println("a: " + a)
        0
    

