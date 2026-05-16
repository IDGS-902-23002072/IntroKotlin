/*
La estructura basica en Kotlin de una clase es:

class [nombre de la clase] {
    [propiedades de la clase]
    [metodos o funciones de la clase]
}
*/

class Persona {
    var nombre: String = ""
    var edad: Int = 0

    fun incializar(nombre:String, edad: Int){
        this.nombre = nombre
        this.edad = edad
    }

    fun imprimir(){
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad(){
        if(edad >= 18){
            println("Es mayor de edad $nombre")
        } else {
            println("No es mayor de edad $nombre")
        }
    }
}

    fun main(parametro: Array<String>){
        val persona1:Persona
        persona1 = Persona()
        persona1.incializar("Juan",12)
        persona1.imprimir()
        persona1.esMayorEdad()
        
        val persona2:Persona
        persona2 = Persona()
        persona2.incializar("Ana",50)
        persona2.imprimir()
        persona2.esMayorEdad()
        
    }