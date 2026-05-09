fun main(){
    var intentos = 0
    var contrasenia = "hola"
    do {
    print("Ingresa la clave de seguridad:")
    val pass = readln()
    if (contrasenia != pass){
        intentos++
    } else {
        break
    }
    } while ( intentos < 3 )

    if (intentos < 3){
    print("Contraseña correcta")
    } else {
    print("Cuenta bloqueada: 3 intentos màximo")
    }
}