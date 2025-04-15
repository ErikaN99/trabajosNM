fun main(parametro: Array<String>) {
    val sueldos: IntArray
    sueldos = IntArray(5)
    //carga de sus elementos por teclado
    for(i in 0..4) {
        print("Ingrese sueldo:")
        sueldos[i] = readLine()!!.toInt()
    }
    //impresion de sus elementos
    for(i in 0..4) {
        println(sueldos[i])
    }
}

//Este programa solicita al usuario que ingrese 5 sueldos, los guarda en un arreglo de enteros y luego los imprime.
//🔹 Se declara un arreglo sueldos de tamaño 5.
//🔹 Se usa un ciclo for para leer los sueldos por consola con readLine()!!.toInt().
//🔹 Luego, otro ciclo for recorre el arreglo y muestra cada sueldo con println().