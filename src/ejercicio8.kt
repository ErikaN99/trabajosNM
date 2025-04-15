class Persona {
    var nombre: String = ""
    var edad: Int = 0

    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }

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
    val persona1: Persona
    persona1 = Persona()
    persona1.inicializar("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()

    val persona2: Persona
    persona2 = Persona()
    persona2.inicializar("Ana", 50)
    persona2.imprimir()
    persona2.esMayorEdad()
}

//Uso de clases en Kotlin para representar personas.
//🔹 Se define la clase Persona con nombre y edad.
//🔹 Tiene métodos para inicializar datos, imprimirlos y verificar si es mayor de edad.
//🔹 En main(), se crean dos objetos Persona, se les asignan valores y se prueban los métodos.
//🔹 Ejemplo muy útil para entender objetos, métodos y encapsulación en Kotlin.