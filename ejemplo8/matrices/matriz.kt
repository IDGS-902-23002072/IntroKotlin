fun main() {
    val matriz1 = crearMatriz()
    val matriz2 = crearMatriz()
    val matrizSuma = Array(3) { DoubleArray(3) }
    mostrarFun(matriz1,matriz2)

}

fun mostrarFun(ma1:Array<DoubleArray>, ma2:Array<DoubleArray>){
    for (i in 0..2) {
        for (j in 0..2) {
            matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("\nResultado de la suma:")
    for (fila in matrizSuma) {
        println(fila.joinToString(" "))
    }
}

fun crearMatriz(): Array<DoubleArray> {
    val matriz = Array(3) { DoubleArray(3) }

    for (i in 0..2) {
        for (j in 0..2) {
            print("Ingresa el número para la posición [$i][$j]: ")
            val entrada = readln().toDouble()           
            matriz[i][j] = entrada
        }
    }

    println("Matriz creada con éxito.\n")
    return matriz
}