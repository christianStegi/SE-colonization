package app

object Colonization : 

    def double(i: Int): Int = i * 2

    def main(args: Array[String]): Unit = 

        println("This is file PrintTui")
        println(printFirstGameField())
        //tryingStuff()        
    

    def printFirstGameField(): String = 
        println("print a prototype of a gameboard")

        val nrCells = 10
        val sizeOfACell = 3
        val eol = sys.props("line.separator")

        def frameOfRow(nrOfCells: Int=3, cellSize: Int=3) = (("+" + "-" * cellSize)) * nrOfCells + "+" + eol
        def rowContent(nrOfCells: Int=3, cellSize: Int=3) = (("+" + " " * cellSize)) * nrOfCells + "+" + eol
        def buildMatrix(height: Int=3, width: Int=3, cellSize: Int=2) = 
            (frameOfRow(width, cellSize) + rowContent(width, cellSize)) * height + frameOfRow(width, cellSize)
    
        buildMatrix(nrCells, nrCells, sizeOfACell)

    
    def tryingStuff(): Int =
        val a = List(1, 2, 3).map(i => double(i)) 
        println("a: " + a)
        0