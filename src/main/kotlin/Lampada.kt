
class Lampada {
    private var identificador:String = ""
    private var estat:Boolean = false
    private var colorInt:Int = 0
    private var colorString = "blanc"
    private var colors = arrayOf("blanc","groc","lila","taronja")
    private var intensitat:Int = 1

    constructor(identificador:String,estat:Boolean){
        this.identificador = identificador
        this.estat = estat
        this.intensitat = intensitat
    }

    fun encendreLampada(){
        this.estat = true
        this.colorInt = 0
        this.colorString = this.colors[colorInt]
        this.intensitat = 1
        println(this)
    }

    fun apagarLampada(){
        this.estat = false
        println(this)
    }

    fun augmentarIntensitat(){
        if(getEstat()){
            this.intensitat++
            println(this)
        }else{
            println("Lampada apagada")
        }
    }

    fun canviarColor(){
        if(getEstat()){
            this.colorInt++
            this.colorString = this.colors[colorInt]
            println(this)
        }else{
            println("Lampada apagada")
        }
    }

    override fun toString(): String {
        return if(!this.estat){
            "Lampada Apagada"
        }else{
            "Lampada Encesa - Color: ${this.colorString} - Intensitat: ${this.intensitat}"
        }
    }

    fun getIdentificador():String{
        return this.identificador
    }

    fun setIdentificador(identificador:String){
        this.identificador = identificador
    }

    fun getEstat():Boolean{
        return this.estat
    }

    fun setEstat(estat: Boolean){
        this.estat = estat
    }

    fun getColorInt ():Int{
        return this.colorInt
    }

    fun setColorInt (colorInt:Int){
        this.colorInt = colorInt
    }

    fun getIntensitat ():Int{
        return this.intensitat
    }

    fun setIntensitat (intensitat:Int){
        this.intensitat = intensitat
    }
}