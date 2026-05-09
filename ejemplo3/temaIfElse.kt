import kotlin.math.pow
fun main(){
    println("Ingrese el sueldo del empleado")
    val sueldo = readln().toDouble()
    if (sueldo > 300){
    println("Paga impuestos")
    } else {
    println("No paga impuestos")
    /*
    > , < , <= , >= , == , != , + , - , * , / , %
    */

    val a = 3
    val b = 5

    val mayor = if (a > b ) a else b
    println("El numero mayor entre $a y $b es $mayor")

    val base = 2.0
    val expo = 3.2
    val res = base.pow(expo)
    println("Resultado: $res")
    }
}