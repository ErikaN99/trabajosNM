fun cargar(arreglo: IntArray) {
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }
}
fun imprimir(arreglo: IntArray) {
    for(elemento in arreglo)
        println(elemento)
}
fun main(parametro: Array<String>) {
    val arre = IntArray(5)
    cargar(arre)
    imprimir(arre)
}

//Este programa separa el proceso en dos funciones: cargar() e imprimir().
//🔹 La función cargar() solicita al usuario que ingrese 5 valores y los guarda en un arreglo.
//🔹 La función imprimir() muestra cada elemento del arreglo.
//🔹 En main(), se crea el arreglo, se carga con datos y luego se imprime, usando llamadas a ambas funciones.
//🔹 Ejemplo claro de modularidad con funciones separadas.