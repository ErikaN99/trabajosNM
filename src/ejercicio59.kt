class Persona1(var nombre: String, var edad: Int) {
    fun imprimir() {
        println("Nombre: $nombre - Edad: $edad años")
    }
    fun esMayorEdad() {
        if (edad >= 18) {
            println("$nombre ES mayor de edad")
        } else {
            println("$nombre NO es mayor de edad")
        }
    }
}
fun main(args: Array<String>) {
    val personas = mutableListOf(
        Persona1("Juan", 22),
        Persona1("Ana", 19),
        Persona1("Marcos", 12)
    )
    println("\nListado completo de personas:")
    personas.forEach { it.imprimir() }
    println("\nVerificación de mayoría de edad:")
    personas.forEach { it.esMayorEdad() }
    val cantMayores = personas.count { it.edad >= 18 }
    println("\nCantidad de personas mayores de edad: $cantMayores")
}
//Muestra una lista de objetos Persona1 con nombre y edad:
//•	Se imprimen los datos de cada persona.
//•	Se verifica si cada persona es mayor de edad.
//•	Se cuenta la cantidad total de personas mayores de edad (edad >= 18).