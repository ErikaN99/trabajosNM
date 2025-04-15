class Vector6 {
    val arreglo = IntArray(5)  // Tamaño fijo de 5 elementos
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
    operator fun inc(): Vector6 {
        val suma1 = Vector6()
        suma1.cargar()
        for(i in arreglo.indices) {
            suma1.arreglo[i] = arreglo[i] + 1
        }
        return suma1
    }
    operator fun dec(): Vector6 {
        val resta1 = Vector6()
        resta1.cargar()
        for(i in arreglo.indices) {
            resta1.arreglo[i] = arreglo[i] - 1
        }
        return resta1
    }
}
fun main(args: Array<String>) {
    var vec1 = Vector6()
    vec1.cargar()
    println("Vector original")
    vec1.imprimir()
    vec1++
    println("Resultado de aplicar el operador ++")
    vec1.imprimir()
    vec1--
    println("Resultado de aplicar el operador --")
    vec1.imprimir()
}

//Se sobrecargan los operadores ++ y -- para que al aplicarse sobre un objeto Vector6, se sumen o resten 1 a
// cada uno de sus elementos. Se demuestra en main() cargando un vector, imprimiendo, aplicando incremento,
// imprimiendo, luego decremento e imprimiendo nuevamente.