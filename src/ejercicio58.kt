fun main(args: Array<String>) {
    // Generar lista de 20 números aleatorios entre 1 y 6
    val lista: MutableList<Int> = MutableList(20) { ((Math.random() * 6) + 1).toInt() }

    println("Lista completa")
    println(lista)

    // Contar cuántas veces aparece el número 1
    val cant = lista.count { it == 1 }
    println("Cantidad de elementos con el valor 1: $cant")

    // Eliminar todos los números 6 de la lista
    lista.removeAll { it == 6 }
    println("Lista luego de borrar los elementos con el valor 6")
    println(lista)
}

//Se genera una lista de 20 números aleatorios del 1 al 6:
//•	Se muestra la lista completa.
//•	Se cuenta cuántas veces aparece el número 1.
//•	Se eliminan todos los elementos con valor 6 de la lista.