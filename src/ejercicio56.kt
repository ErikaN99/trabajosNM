fun cargar3(): Int {
    print("Ingrese un entero: ")
    val valor = readLine()!!.toInt()
    return valor
}

fun main(args: Array<String>) {
    print("¿Cuántos elementos tendrá la lista? ")
    val tamaño = readLine()!!.toInt()

    val lista1 = MutableList(tamaño) { cargar3() }
    println("La lista creada es: $lista1")
}

//Este programa solicita un valor entero al usuario mediante la función cargar3(), luego pregunta cuántos elementos
// tendrá una lista, y finalmente crea una lista mutable (MutableList) con el tamaño especificado y con el valor ingresado.