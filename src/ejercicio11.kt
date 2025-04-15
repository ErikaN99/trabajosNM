class Triangulo2(var lado1: Int, var lado2: Int, var lado3: Int) {

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
    val triangulo1 = Triangulo2(12, 45, 24)
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}

//Este ejemplo crea una clase Triangulo2 con un constructor simplificado que recibe los tres lados al momento de crear el objeto.
//🔹 ladoMayor() usa when para imprimir cuál es el lado más largo.
//🔹 esEquilatero() compara los tres lados para saber si el triángulo es equilátero.
//🔹 En main(), se instancia triangulo1 con valores específicos y se invocan los métodos definidos.
//🔹 Es una versión más directa respecto al ejemplo anterior.