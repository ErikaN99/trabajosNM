fun IntArray.imprimir() {
    print("[")
    for(elemento in this) {
        print("$elemento ")
    }
    println("]")
}

fun main(args: Array<String>) {
    val arreglo = IntArray(10) { it }  // Crea array [0, 1, 2, ..., 9]
    arreglo.imprimir()
}

//Se extiende la clase IntArray con la función imprimir() que:
//	Imprime todos los elementos de un arreglo de enteros encerrados entre [ y ].
//En main, se crea un arreglo de 10 elementos del 0 al 9 usando IntArray(size) { it } y se imprime con la nueva función.
