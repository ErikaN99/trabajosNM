fun main(args: Array<String>) {
    var lista1: List<String> = listOf("lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo")
    println("Imprimir la lista completa")
    println(lista1)
    println("Imprimir el primer elemento de la lista")
    println(lista1[0])
    println("Imprimir el primer elemento de la lista (usando first())")
    println(lista1.first())
    println("Imprimir el último elemento de la lista")
    println(lista1.last())
    println("Imprimir el último elemento de la lista (usando índice)")
    println(lista1[lista1.size-1])
    println("Imprimir la cantidad de elementos de la lista")
    println(lista1.size)
    println("Recorrer la lista completa con un for")
    for(elemento in lista1) {
        print("$elemento ")
    }
    println()
    println("Imprimir el elemento y su posición")
    for(posicion in lista1.indices) {
        print("[$posicion]${lista1[posicion]} ")
    }
}
//Se crea una lista inmutable lista1 con los días de la semana. Se imprime toda la lista de días. Se imprime el primer
//día de la semana (lunes) usando índice. Se imprime el primer día usando el metodo first().Se imprime el último día
//(domingo) usando last().Se imprime el último elemento mediante su posición. Se muestra cuántos elementos tiene la lista
// (7). Se recorre e imprime la lista con un bucle for. Se imprimen los elementos junto con su posición correspondiente.