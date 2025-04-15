object Matematica {
    val PI = 3.1416

    fun aleatorio(minimo: Int, maximo: Int) = ((Math.random() * (maximo + 1 - minimo)) + minimo).toInt()
}

fun main(parametro: Array<String>) {
    println("El valor de Pi es ${Matematica.PI}")
    print("Un valor aleatorio entre 5 y 10: ")
    println(Matematica.aleatorio(5, 10))
}

//Se presenta el uso de object en Kotlin para definir un objeto único y estático.
//🔹 Matematica contiene una constante PI y una función aleatorio() que devuelve un número entero aleatorio entre dos límites.
//🔹 En main(), se imprime el valor de PI y se genera un número aleatorio entre 5 y 10.
//🔹 Ejemplo útil para representar librerías o utilidades sin necesidad de instanciación.