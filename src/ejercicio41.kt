class Persona7(val nombre: String, val edad: Int) {
    fun imprimir() {
        println("Nombre: $nombre Edad: $edad")
    }

    fun esMayor() = edad >= 18  // Forma simplificada
}

fun main(parametro: Array<String>) {
    val personas: Array<Persona7> = arrayOf(  // Cambiado Persona4 a Persona
        Persona7("Ana", 22),
        Persona7("Juan", 13),
        Persona7("Carlos", 6),
        Persona7("Maria", 72))

    println("Listado de personas:")
    for(per in personas) {
        per.imprimir()
    }

    var cant = 0
    personas.forEach {
        if (it.esMayor()) {
            cant++
        }
    }
    println("Cantidad de personas mayores de edad: $cant")
}

//	Se define una clase Persona7 con los atributos nombre y edad.
//	El método imprimir() muestra el nombre y la edad de cada persona.
//	El método esMayor() devuelve true si la edad es mayor o igual a 18.
//	En la función main, se crea un arreglo de personas (Persona7).
//	Se imprimen todas las personas.
//	Luego, se cuenta cuántas personas son mayores de edad usando forEach y se imprime ese total.