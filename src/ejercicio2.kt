fun main(parametero: Array<String>) {
    val alturas = FloatArray(5)
    var suma = 0f
    for(i in 0..alturas.size-1) {
        print("Ingrese la altura:")
        alturas[i] = readLine()!!.toFloat()
        suma += alturas[i]
    }
    val promedio = suma / alturas.size
    println("Altura promedio: $promedio")

    var altos = 0
    var bajos = 0
    for(i in 0..alturas.size-1)
        if (alturas[i] > promedio)
            altos++
        else
            bajos++

    println("Cantidad de personas más altas que el promedio: $altos")
    println("Cantidad de personas más bajas que el promedio: $bajos")
}

//Este programa trabaja con alturas de personas: calcula el promedio e indica cuántas personas están por encima o por debajo del mismo.
//🔹 Se declara un arreglo alturas de tipo FloatArray.
//🔹 Se leen 5 alturas y se suman para obtener el promedio.
//🔹 Luego, se recorren nuevamente para contar cuántas son mayores y cuántas menores    que el promedio.
//🔹 Finalmente, imprime la cantidad de personas altas y bajas respecto al promedio.