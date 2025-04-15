class Triangulo {
    var lado1: Int = 0
    var lado2: Int = 0
    var lado3: Int = 0

    fun inicializar() {
        print("Ingrese lado 1: ")
        lado1 = readLine()!!.toInt()
        print("Ingrese lado 2: ")
        lado2 = readLine()!!.toInt()
        print("Ingrese lado 3: ")
        lado3 = readLine()!!.toInt()
    }

    fun ladoMayor() {
        print("Lado mayor: ")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            println("Es un triángulo equilátero")
        else
            println("No es un triángulo equilátero")
    }
}

fun main(parametro: Array<String>) {
    val triangulo1 = Triangulo()
    triangulo1.inicializar()
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}

//Este ejemplo define una clase Triangulo con funciones para identificar el lado mayor y verificar si es equilátero.
//🔹 inicializar() solicita los tres lados al usuario.
//🔹 ladoMayor() usa when para encontrar e imprimir el lado más largo.
//🔹 esEquilatero() compara los lados para determinar si son iguales.
//🔹 En main(), se crea un objeto triangulo1 y se llaman sus métodos en orden.