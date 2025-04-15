class Persona8(val nombre: String, val edad: Int) {

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    operator fun compareTo(per2: Persona8): Int {
        return when {
            edad < per2.edad -> -1
            edad > per2.edad -> 1
            else -> 0
        }
    }
}

fun main(parametro: Array<String>) {
    val persona1 = Persona8("Juan", 30)
    persona1.imprimir()

    val persona2 = Persona8("Ana", 30)
    persona2.imprimir()

    println("\nComparación de edades:")
    when {
        persona1 > persona2 -> {
            print("La persona mayor es: ")
            persona1.imprimir()
        }
        persona1 < persona2 -> {
            print("La persona mayor es: ")
            persona2.imprimir()
        }
        else -> println("Tienen la misma edad")
    }
}
//Esta clase define una persona con nombre y edad, y permite imprimir esos datos.
// Además, se sobrecarga el operador compareTo (usado con <, >, ==) para comparar dos objetos Persona8 según su edad.
// En la función main() se crean dos objetos Persona8. Luego se comparan usando los operadores <, > y ==
// gracias a la función compareTo. Dependiendo del resultado, se muestra quién es mayor o si tienen la misma edad.