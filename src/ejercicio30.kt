class Persona2(val nombre: String, val edad: Int) {
    fun imprimir() {
        println("Nombre: $nombre Edad: $edad")
    }

    fun esMayor() = if (edad >= 18) true else false
}

fun main(parametro: Array<String>) {
    val personas: Array<Persona2> = arrayOf(Persona2("Ana", 22),Persona2("Juan", 13),
        Persona2("Carlos", 6),Persona2("Maria", 72))
    println("Listado de personas:")
    for(per in personas)
        per.imprimir()
    var cant = 0
    for(per in personas)
        if (per.esMayor())
            cant++


    println("Cantidad de personas mayores de edad: $cant")
}

//Uso de arreglos de objetos y evaluación de condiciones.
//🔹 Se define la clase Persona2 con nombre y edad, y un método esMayor() para determinar si es mayor de edad.
//🔹 En main(), se crea un arreglo de varias personas.
//🔹 Se imprime la lista y luego se cuenta cuántas son mayores de edad.
//🔹 Demuestra cómo recorrer arreglos de objetos y aplicar lógica condicional sobre ellos.