class Dado2 {
    private var valor: Int = 1

    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    fun imprimir() {
        separador()
        println("Valor del dado: $valor")
        separador()
    }

    private fun separador() = println("************************************")
}

fun main(parametro: Array<String>) {
    val dado1 = Dado2()
    dado1.tirar()
    dado1.imprimir()
}

//Clase Dado2 con encapsulamiento y separación visual.
//🔹 El atributo valor es privado.
//🔹 tirar() genera un valor aleatorio del 1 al 6.
//🔹 imprimir() muestra el valor con un separador visual (********...).
//🔹 La función separador() está marcada como privada y se usa para dar formato.
//🔹 En main(), se lanza el dado y se muestra el resultado.
//🔹 Buen ejemplo de encapsulamiento y reutilización de funciones pequeñas.