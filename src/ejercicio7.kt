fun cargar(): IntArray {
    print("¿Cuántos elementos quiere cargar?: ")
    val cantidad = readLine()!!.toInt()
    val sueldos = IntArray(cantidad)
    for (i in sueldos.indices) {
        print("Ingrese elemento: ")
        sueldos[i] = readLine()!!.toInt()
    }
    return sueldos
}

// Cambié el nombre de la función para evitar conflicto
fun imprimirSueldos(sueldos: IntArray) {
    println("Listado de todos los elementos")
    for (sueldo in sueldos)
        println(sueldo)
}

fun main(parametro: Array<String>) {
    val sueldos = cargar()
    imprimirSueldos(sueldos)
}

//Este código mejora el anterior permitiendo al usuario decidir cuántos elementos ingresar.
//🔹 En cargar(), se solicita la cantidad de elementos a cargar y se construye un arreglo de ese tamaño.
//🔹 Se devuelven los valores como resultado de la función (return sueldos).
//🔹 imprimirSueldos() muestra el contenido del arreglo.
//🔹 Se usa en main() para demostrar cómo retornar y pasar arreglos entre funciones.