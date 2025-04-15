class Vector9 {
    private val arreglo = IntArray(5)  // Tamaño fijo de 5 elementos

    fun cargar() {
        for (i in arreglo.indices) {
            arreglo[i] = (Math.random() * 11 + 1).toInt()
        }
    }

    fun imprimir() {
        for (elemento in arreglo) {
            print("$elemento ")
        }
        println()
    }

    operator fun plus(vector2: Vector9): Vector9 {
        val suma = Vector9()
        for (i in arreglo.indices) {
            suma.arreglo[i] = arreglo[i] + vector2.arreglo[i]
        }
        return suma
    }

    operator fun minus(vector2: Vector9): Vector9 {
        val resta = Vector9()
        for (i in arreglo.indices) {
            resta.arreglo[i] = arreglo[i] - vector2.arreglo[i]
        }
        return resta
    }

    operator fun times(vector2: Vector9): Vector9 {
        val producto = Vector9()
        for (i in arreglo.indices)
            producto.arreglo[i] = arreglo[i] * vector2.arreglo[i]
        return producto
    }

    operator fun div(vector2: Vector9): Vector9 {
        val division = Vector9()
        for (i in arreglo.indices) {
            division.arreglo[i] = arreglo[i] / vector2.arreglo[i]
        }
        return division
    }
}

fun main(args: Array<String>) {
    val vec1 = Vector9()
    vec1.cargar()
    val vec2 = Vector9()
    vec2.cargar()

    vec1.imprimir()
    vec2.imprimir()

    val vecSuma = vec1 + vec2
    println("Suma componente a componente de los dos vectores")
    vecSuma.imprimir()

    val vecResta = vec1 - vec2
    println("Resta componente a componente de los dos vectores")
    vecResta.imprimir()

    val vecProducto = vec1 * vec2
    println("Producto componente a componente de los dos vectores")
    vecProducto.imprimir()

    val vecDivision = vec1 / vec2
    println("División componente a componente de los dos vectores")
    vecDivision.imprimir()
}
//	Se define la clase Vector que almacena un arreglo de 5 enteros.
//	Se sobrecargan los operadores +, -, *, / para sumar, restar, multiplicar y dividir dos vectores componente a componente.
//	En main se crean dos vectores (vec1, vec2) que se cargan con valores aleatorios.
//	Se realizan las operaciones entre ambos vectores y se imprimen los resultados.