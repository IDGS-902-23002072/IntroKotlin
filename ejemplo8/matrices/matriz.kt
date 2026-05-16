fun main() {
    menu()
}

fun menu(){
do{
        val matriz1 = crearMatriz()
        val matriz2 = crearMatriz()
        mostrarFun(matriz1, matriz2)
        println("Desea hacer otro intento? [1] es si, cualquier número es No")
        val entrada = readln().toInt()
    }while(entrada == 1)
}

fun mostrarFun(ma1: Array<DoubleArray>, ma2: Array<DoubleArray>) {
    val matrizSuma = Array(3) { DoubleArray(3) }
    for (i in 0..2) {
        for (j in 0..2) {
            matrizSuma[i][j] = ma1[i][j] + ma2[i][j]
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
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
    return matriz
}