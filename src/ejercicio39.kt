fun recorrerTodo(arreglo: IntArray, fn: (Int) -> Unit) {
    for(elemento in arreglo) {
        fn(elemento)
    }
}

fun main(args: Array<String>) {
    val arreglo1 = IntArray(10)
    for (i in arreglo1.indices) {
        arreglo1[i] = (Math.random() * 100).toInt()
    }

    println("Impresión de todo el arreglo")
    for (elemento in arreglo1) {
        print("$elemento ")
    }
    println()

    var cantidad = 0
    recorrerTodo(arreglo1) {
        if (it % 3 == 0) {
            cantidad++
        }
    }
    println("La cantidad de elementos múltiplos de 3 son $cantidad")

    var suma = 0
    recorrerTodo(arreglo1) {
        if (it > 50) {
            suma += it
        }
    }
    println("La suma de todos los elementos mayores a 50 es $suma")
}
//Uso de funciones count, all y any para evaluar condiciones en arreglos.
//🔹 Se genera un arreglo de 20 enteros aleatorios entre 0 y 10.
//🔹 Se cuenta cuántos son menores o iguales a 5.
//🔹 Se evalúa si todos son menores o iguales a 9.
//🔹 Se evalúa si alguno de los elementos es igual a 10.
//🔹 Ejemplo ideal para aprender evaluaciones globales de condiciones.