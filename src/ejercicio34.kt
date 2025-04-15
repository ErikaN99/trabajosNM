fun imprimirSi(arreglo: IntArray, fn: (Int) -> Boolean) {
    for(elemento in arreglo) {
        if (fn(elemento)) {
            print("$elemento ")
        }
    }
    println()
}
fun main(parametro: Array<String>) {
    val arreglo1 = IntArray(10)
    for(i in arreglo1.indices) {
        arreglo1[i] = ((Math.random() * 100)).toInt()
    }
    println("Imprimir los valores múltiplos de 2")
    imprimirSi(arreglo1) { x -> x % 2 == 0 }
    println("Imprimir los valores múltiplos de 3 o de 5")
    imprimirSi(arreglo1) { x -> x % 3 == 0 || x % 5 == 0 }
    println("Imprimir los valores mayores o iguales a 50")
    imprimirSi(arreglo1) { x -> x >= 50 }
    println("Imprimir los valores comprendidos entre 1 y 10, 20 y 30, 90 y 95")
    imprimirSi(arreglo1) { x ->
        when(x) {
            in 1..10 -> true
            in 20..30 -> true
            in 90..95 -> true
            else -> false
        }
    }
    println("Imprimir todos los valores")
    imprimirSi(arreglo1) { x -> true }
}
//Filtrado condicional de un arreglo usando funciones lambda.
//🔹 La función imprimirSi() imprime solo los elementos que cumplen cierta condición definida por una función booleana.
//🔹 En main(), se llena un arreglo con números aleatorios.
//🔹 Se imprimen valores según diferentes criterios: múltiplos de 2, múltiplos de 3 y 5, mayores a 50, dentro de ciertos rangos, o todos.
//🔹 Muestra cómo usar funciones de orden superior para filtrar dinámicamente.