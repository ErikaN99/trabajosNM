class Operaciones {
    var valor1: Int = 0
    var valor2: Int = 0

    fun cargar() {
        print("Ingrese primer valor: ")
        valor1 = readLine()!!.toInt()
        print("Ingrese segundo valor: ")
        valor2 = readLine()!!.toInt()
        sumar()
        restar()
    }

    fun sumar() {
        val suma = valor1 + valor2
        println("La suma de $valor1 y $valor2 es $suma")
    }

    fun restar() {
        val resta = valor1 - valor2
        println("La resta de $valor1 y $valor2 es $resta")
    }
}

fun main(parametro: Array<String>) {
    val operaciones1 = Operaciones()
    operaciones1.cargar()
}

//Clase Operaciones que realiza suma y resta de dos números.
//🔹 La función cargar() pide al usuario dos valores y luego llama a sumar() y restar().
//🔹 sumar() calcula la suma e imprime el resultado.
//🔹 restar() hace lo mismo con la resta.
//🔹 En main(), se crea una instancia de la clase y se llama a cargar().
//🔹 Ilustra el uso básico de métodos dentro de una clase para operaciones aritméticas.