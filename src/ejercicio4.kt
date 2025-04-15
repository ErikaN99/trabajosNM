fun main(parametro: Array<String>) {
    val arreglo = IntArray(10)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }
    println("Primera componente del arreglo: ${arreglo[0]}")
    println("Ultima componente del arreglo: ${arreglo[arreglo.lastIndex]}")
}

//Este programa carga un arreglo con 10 números y luego muestra el primero y el último valor ingresado.
//🔹 Usa arreglo.indices para recorrer los índices válidos del arreglo.
//🔹 Guarda los datos introducidos por el usuario.
//🔹 Imprime la primera posición (arreglo[0]) y la última usando arreglo.lastIndex.