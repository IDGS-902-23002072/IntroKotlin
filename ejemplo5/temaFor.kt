/*
definicion de rangos
val unDigito = 1..9
val letras = 'a'...'z'
val docena = 1..12

if (5 in docena) {
printlin("el numero 5 esta en el rango docena")
}

if (18 !in docena) {
printlin("el numero 18 no esta en el rango docena")
}
*/

fun main(){
    for (i in 1..10)
    println(i)
    
    for (a in 1..10 step 2)
    println(a)
    
    for (b in 10 downTo 1)
    println(b)
    
    for (c in 10 downTo 1 step 2)
    println(c)

}