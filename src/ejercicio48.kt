class TarCri {
    val tablero = IntArray(9)

    fun imprimir() {
        for(fila in 0..2) {
            for (columns in 0..2)
                print("${this[fila, columns]} ");
            println()
        }
        println()
    }

    operator fun set(fila: Int, columns: Int, valor: Int) {
        tablero[fila*3 + columns] = valor
        imprimir()
    }

    operator fun get(fila: Int, columns: Int): Int {
        return tablero[fila*3 + columns]
    }
}

fun main(args: Array<String>) {
    val juego = TarCri()
    juego[0, 0] = 1
    juego[0, 2] = 2
    juego[2, 0] = 1
    juego[1, 2] = 2
    juego[1, 0] = 1
}

//Se simula un tablero 3x3 (como el juego del gato) usando un arreglo unidimensional de 9 posiciones.
// Se sobrecargan los operadores get y set para acceder con notación de dos índices [fila, columna].
// Se prueba asignando valores en main() y se imprime el tablero.