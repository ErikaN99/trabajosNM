enum class TipoCarta {
    DIAMANTE,
    TREBOL,
    CORAZON,
    PICA
}

class Carta(val tipo: TipoCarta, val valor: Int) {
    fun imprimir() {
        println("Carta: $tipo y su valor es $valor")
    }
}

fun main(parametro: Array<String>) {
    val carta1 = Carta(TipoCarta.TREBOL, 4)
    carta1.imprimir()
}

//Se introduce el uso de enumeraciones (enum class) en Kotlin.
//🔹 TipoCarta es una enumeración con cuatro valores: DIAMANTE, TREBOL, CORAZON, PICA.
//🔹 La clase Carta tiene dos propiedades: tipo (de tipo TipoCarta) y valor (entero).
//🔹 El método imprimir() muestra el tipo de carta y su valor.
//🔹 En main(), se crea una carta de trébol con valor 4 y se imprime.
//🔹 Este ejemplo enseña cómo combinar enums con clases personalizadas.