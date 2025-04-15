fun main(parametero: Array<String>) {
    val arreglo = IntArray(10)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }
    for(elemento in arreglo) {
        println(elemento)
    }
}

//Este ejemplo guarda 10 números introducidos por el usuario y luego los imprime uno por uno.
//🔹 Se recorre el arreglo usando arreglo.indices para llenar los datos.
//🔹 Luego, un segundo for con for (elemento in arreglo) imprime cada valor.
//🔹 Muestra cómo iterar directamente sobre los valores de un arreglo sin usar índices.