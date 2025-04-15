fun main(parametro: Array<String>) {
    val arreglo = IntArray(10)
    for(i in 0..arreglo.size-1) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }

    var ordenado = true
    for(i in 0..arreglo.size-2) {
        if (arreglo[i+1] < arreglo[i]) {
            ordenado = false
        }
    }

    if (ordenado) {
        print("Los elementos están ordenados de menor a mayor")
    } else {
        print("Los elementos no están ordenados de menor a mayor")
    }
}

//Este código permite ingresar 10 valores enteros y determina si el arreglo está ordenado de menor a mayor.
//🔹 Se llena un arreglo arreglo con 10 enteros introducidos por el usuario.
//🔹 Luego se recorre el arreglo comparando elementos consecutivos.
//🔹 Si encuentra un valor menor que el anterior, cambia la variable ordenada a false.
//🔹 Al final, imprime un mensaje indicando si los elementos están ordenados o no.