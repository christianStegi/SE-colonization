//package de.htwg.se.view.tui
package src.main.scala.de.htwg.se.view.tui

object Tui:

    def printFirstGameField(cols: Int=2, rows: Int=2): String = 
        println("print a prototype of a gameboard")

        val sizeOfACell = 3
        val eol = sys.props("line.separator")

        def frameOfRow(nrOfCells: Int=3, cellSize: Int=3) = (("+" + "-" * cellSize)) * nrOfCells + "+" + eol
        def rowContent(nrOfCells: Int=3, cellSize: Int=3) = (("+" + " " * cellSize)) * nrOfCells + "+" + eol
        def buildMatrix(height: Int=3, width: Int=3, cellSize: Int=2) = 
            (frameOfRow(width, cellSize) + rowContent(width, cellSize)) * height + frameOfRow(width, cellSize)
    
        buildMatrix(cols, rows, sizeOfACell)

    
    def repaint : String =
        "repainting Tui..."

