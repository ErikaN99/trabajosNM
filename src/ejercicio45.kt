class Vector4 {
    val arreglo = IntArray(5)

    fun cargar() {
        for(i in arreglo.indices) {
            arreglo[i] = (Math.random() * 11 + 1).toInt()
        }
    }

    fun imprimir() {
        for(elemento in arreglo) {
            print("$elemento ")
        }
        println()
    }

    operator fun times(valor: Int): Vector4 {
        val producto = Vector4()
        for(i in arreglo.indices) {
            producto.arreglo[i] = arreglo[i] * valor
        }
        return producto
    }
}

fun main(args: Array<String>) {
    val vec1 = Vector4()
    vec1.cargar()
    println("Vector original:")
    vec1.imprimir()

    println("\nEl producto del vector con el número 10 es:")
    val vecProductoEnt = vec1 * 10
    vecProductoEnt.imprimir()
}
//	Se define una clase Vector4 con un arreglo de 5 elementos.
//	Se sobrecarga el operador * para multiplicar el vector por un número entero.
//	En main, se crea un vector (vec1), se llena con valores aleatorios y se multiplica por 10.
//	Se imprime el vector original y el resultado del producto.