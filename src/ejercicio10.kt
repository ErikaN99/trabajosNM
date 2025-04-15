class Persona6 constructor(nombre: String, edad: Int) {
    var nombre: String = nombre
    var edad: Int = edad

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}

fun main(parametro: Array<String>) {
    val persona1 = Persona6("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()
}

//Aquí se crea una versión optimizada de la clase Persona usando un constructor en la cabecera.
//🔹 nombre y edad se asignan directamente desde el constructor.
//🔹 Métodos imprimir() y esMayorEdad() funcionan igual que antes.
//🔹 En main(), se instancia un objeto Persona6 con datos desde el inicio.
//🔹 Es una forma más limpia y directa de definir e inicializar clases en Kotlin.