val scalaCheatSheet: String = "https://docs.scala-lang.org/cheatsheets/index.html"
println(scalaCheatSheet)


// Eine Klasse braucht immer runde Klammern für Parameter und nen Doppelpunkt
// Eine class kann ohne runde Klammern für Parameter erzeugt werden, eine case class nicht
case class Klassenname(): 

    //Eine Methode/Funktion braucht ein =
    def hello(): String =
        "hello"
        
val a1 = Klassenname()
a1.hello()
println(a1.hello())

val a : Int = 5

trait Abc:

    def emptyMethod(): Int


class AbcMember(number: Int) extends Abc:
    def emptyMethod(): Int = 
        100

    def giveBackParameter(): Int =
        number

val abcObject = AbcMember(300)
println(abcObject.emptyMethod())
println(abcObject.giveBackParameter())