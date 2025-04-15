fun main(parametro: Array<String>) {
    val arreglo = IntArray(10)
    for (i in arreglo.indices) {
        arreglo[i] = (Math.random() * 100).toInt()
    }

    println("Impresión de todo el arreglo")
    for (elemento in arreglo) {
        print("$elemento ")
    }
    println()

    var cantidad = 0
    arreglo.forEach {
        if (it % 3 == 0) {
            cantidad++
        }
    }
    println("La cantidad de elementos múltiplos de 3 son $cantidad")

    var suma = 0
    arreglo.forEach {
        if (it > 50) {
            suma += it
        }
    }
    println("La suma de todos los elementos mayores a 50 es $suma")
}
//Función recorrerTodo() como función de orden superior para recorrer arreglos.
//🔹 Esta función aplica una función recibida a cada elemento del arreglo.
//🔹 Se usa para imprimir, contar múltiplos de 3 y sumar los mayores a 50.
//🔹 Demuestra reutilización de lógica con funciones lambda.
//🔹 Ideal para abstraer y reducir la repetición de bucles.