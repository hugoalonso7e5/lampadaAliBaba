fun main() {
    println("Aixó es una lampada. Escull entre les seguents opcions per realitzar una acció.")
    var menuBool = false //Boolean que controla si es torna a executar el menu o no.
    var status = false // Boolean de l'estat de la lampada. (false = apagada / true = encesa)
    var color = arrayOf("blanc","groc","lila","taronja")
    var colorActualString = "blanc"
    var colorActualInt = 0
    var intensitat = 1
    do{
        println()
        printMenu()
        var opcio = readSentence("Escriu la teva opció: ", "Tipus de dada incorrecta!")
        when(opcio.lowercase()){
            "turn off" -> {
                status = false
                colorActualInt = 0
                intensitat = 1
                colorActualString = color[colorActualInt]
            }
            "turn on" -> {
                status = true
            }
            "intensitat" -> intensitat++
            "change color" -> {
                colorActualInt = canviarColor(colorActualInt)
                colorActualString = color[colorActualInt]
            }
            "end" -> menuBool=true
        }
        printarEstat(status,colorActualString,intensitat)
    }while(!menuBool)
}

fun printMenu() {
    println("TURN OFF -> Apagar la lampada si està encesa (Si ja està apagada no fa res!)")
    println("TURN ON -> Encen la lampada si està apagada (Si ja està encesa no fa res!)")
    println("INTENSITAT -> Puja l'intensitat en 1. (El màxim es 5, a partir d'aqui torna a ser 1)")
    println("CHANGE COLOR -> Canvia el color al seguent. (Comença en blanc, i van en ordre (Blanc, groc, lila, taronja))" )
    println("END -> Acaba el programa.")
}

fun printarEstat(status: Boolean, colorActualString: String, intensitat: Int) {
    println()
    if(!status) println("Lampada apagada")
    else println("Lampada: Encesa - Color: $colorActualString - Intensitat: $intensitat")
}

fun canviarColor(colorActualInt: Int): Int {
    return if(colorActualInt==4){
        0
    }else colorActualInt+1
}