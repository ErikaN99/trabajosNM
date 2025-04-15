class Dado(var valor: Int) {

    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
        imprimir()
    }

    fun imprimir() {
        println("Valor del dado: $valor")
    }
}

class JuegoDeDados {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)

    fun jugar() {
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()

        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
            println("Ganó")
        else
            println("Perdió")
    }
}

fun main(parametro: Array<String>) {
    val juego1 = JuegoDeDados()
    juego1.jugar()
}

//Simula un juego de dados con clases Dado y JuegoDeDados.
//🔹 Dado tiene un metodo tirar() que asigna un número aleatorio entre 1 y 6.
//🔹 JuegoDeDados contiene tres dados y un metodo jugar() que lanza los tres.
//🔹 Si los tres dados muestran el mismo valor, imprime “Ganó”, si no, “Perdió”.
//🔹 En main(), se crea un objeto del juego y se invoca jugar().
//🔹 Ejemplo divertido de cómo usar clases para modelar juegos aleatorios.