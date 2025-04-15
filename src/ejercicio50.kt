class Vector7 {
    val arreglo = IntArray(5) { it }

    fun imprimir() {
        for (elemento in arreglo)
            print("$elemento ")
        println()
    }

    operator fun plusAssign(vec2: Vector7) {
        for(i in arreglo.indices)
            arreglo[i] += vec2.arreglo[i]
    }
}

fun main(args: Array<String>) {
    val vec1 = Vector7()
    vec1.imprimir()

    val vec2 = Vector7()
    vec2.imprimir()

    vec1 += vec2
    vec1.imprimir()
}
//Se utiliza el operador += para sumar elemento a elemento los valores de dos vectores. El resultado modifica
// directamente a vec1. El main() muestra el vector antes y después de aplicar +=.