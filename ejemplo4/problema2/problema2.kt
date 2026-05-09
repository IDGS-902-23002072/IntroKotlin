fun main(){
    var carga = 0
    do{
        println("Carga actual: $carga %")
        carga+= 15
        if (carga > 100){
            carga = 100
        }
    } while ( carga < 100 )
        println("Carga completa: $carga %")
}