import kotlin.math.pow

/* INSTRUCCION:
Crear un programa que permita calcular el área de 4 figuras, mostrara un menú para elegir la figura a calcular el área, pedirá los valores necesarios y mostrara el resultado, a continuación, mostrara nuevamente el menú termina al elegir opción 5
*/

fun main(){
do{

    print("""
    -------------- Bienvenido --------------
    Selecciona la figura:
    1.- Triangulo
    2.- Rectangulo
    3.- Circulo
    4.- Cuadrado
    5.- Salir
    """)
    val opcion = readln().toInt()
    when {
        opcion == 1 -> triangulo()
        opcion == 2 -> rectangulo()
        opcion == 3 -> circulo()
        opcion == 4 -> cuadrado()
        opcion == 5 -> break
        else -> print("Opcion invalida: intente de nuevo")
        
    }
    } while (opcion != 5)
    println("¡Ha salido con exito!")
}

fun triangulo(){
    print("Ingresa la base del triangulo:")
    val base = readln().toDouble()
    print("Ingresa la altura del triangulo:")
    val altura = readln().toDouble()
    
    var area = (altura * base) / 2 
    println("El area del triangulo con base: $base y altura: $altura = $area")
}

fun rectangulo(){
    print("Ingresa la base del rectangulo:")
    val base = readln().toDouble()
    print("Ingresa la altura del rectangulo:")
    val altura = readln().toDouble()
    
    var area = (altura * base) 
    println("El area del rectangulo con base: $base y altura: $altura = $area")
}

fun circulo(){
    print("Ingresa el radio del circulo:")
    val radio = readln().toDouble()
    
    var area =  3.1416 * (radio.pow(2))
    println("El area del circulo con radio: $radio = $area")
}

fun cuadrado(){
    print("Ingresa el lado del cuadrado:")
    val lado = readln().toDouble()
    
    var area = lado.pow(2) 
    println("El area del cuadrado con lado: $lado = $area")
}

fun limpiarPantalla(){
    ProcessBuilder("cmd", "/c", "cls")
    .inheritIO()
    .start()
    .waitFor()
}