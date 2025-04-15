fun imprimirSi2(arreglo: IntArray, fn: (Int) -> Boolean) {
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
        arreglo1[i] = (Math.random() * 100).toInt()
    }
    println("Imprimir los valores múltiplos de 2")
    imprimirSi(arreglo1) { it % 2 == 0 }
    println("Imprimir los valores múltiplos de 3 o de 5")
    imprimirSi(arreglo1) { it % 3 == 0 || it % 5 == 0 }
    println("Imprimir los valores mayores o iguales a 50")
    imprimirSi(arreglo1) { it >= 50 }
    println("Imprimir los valores comprendidos entre 1 y 10, 20 y 30, 90 y 95")
    imprimirSi(arreglo1) {
        when(it) {
            in 1..10 -> true
            in 20..30 -> true
            in 90..95 -> true
            else -> false
        }
    }
    println("Imprimir todos los valores")
    imprimirSi(arreglo1) { true }
}
//Este código muestra cómo recorrer un arreglo con forEach para hacer operaciones:
//🔹 Se genera un arreglo de 10 números aleatorios del 0 al 99.
//🔹 Se imprime todo el arreglo.
//🔹 Se usa forEach para contar cuántos elementos son múltiplos de 3.
//🔹 Luego, se suma con forEach los elementos mayores a 50.
//🔹 Es un ejemplo claro del uso de funciones lambda en recorridos.