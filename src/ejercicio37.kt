fun filter(cadena: String, fn: (Char) -> Boolean): String {
    val resultado = StringBuilder()
    for (c in cadena) {
        if (fn(c)) {
            resultado.append(c)
        }
    }
    return resultado.toString()
}

fun main(args: Array<String>) {
    val cadena = "¿aprueba1 o no aprueba2?"

    println("String original:")
    println(cadena)

    val resultado1 = filter(cadena) {
        it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' ||
                it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U'
    }
    println("\nSolo las vocales:")
    println(resultado1)

    val resultado2 = filter(cadena) {
        it in 'a'..'z'
    }
    println("\nSolo caracteres en minúscula:")
    println(resultado2)

    val resultado3 = filter(cadena) {
        it !in 'a'..'z' && it !in 'A'..'Z'
    }
    println("\nSolo caracteres no alfabéticos:")
    println(resultado3)
}
//Función imprimirSi2() con condición de impresión usando expresiones lambda.
//🔹 Se crea un arreglo de 10 enteros aleatorios entre 0 y 99.
//🔹 Se imprimen:
//•	Múltiplos de 2
//•	Múltiplos de 3 o de 5
//•	Números mayores o iguales a 50
//•	Números dentro de ciertos rangos con when
//•	Todos los elementos
//🔹 Es un ejercicio completo de uso de condiciones lógicas para filtrado dinámico.