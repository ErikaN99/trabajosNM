enum class Operation {
    SUMA,
    PROMEDIO
}

fun operar(tipoOperation: Operation, vararg arreglo: Int): Int {
    when (tipoOperation) {
        Operation.SUMA -> return arreglo.sum()
        Operation.PROMEDIO -> return arreglo.average().toInt()
    }
}

fun main(args: Array<String>) {
    val resultado1 = operar(Operation.SUMA, 10, 20, 30)
    println("La suma es $resultado1")
    val resultado2 = operar(Operation.PROMEDIO, 10, 20, 30)
    println("El promedio es $resultado2")
}
//Se define una enumeración Operation con dos opciones: SUMA y PROMEDIO. La función operar realiza operaciones
//sobre un arreglo variable de enteros dependiendo del tipo especificado: suma o promedio. En main, se muestra el
//resultado de ambas operaciones con los mismos números.