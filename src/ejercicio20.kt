data class Persona3(var nombre: String, var edad: Int) {
    override fun toString(): String {
        return "$nombre, $edad"
    }
}

fun main(parametro: Array<String>) {
    var persona1 = Persona3("Juan", 22)
    var persona2 = Persona3("Ana", 59)
    println(persona1)
    println(persona2)
}

//Definición de una data class personalizada con metodo toString() sobreescrito.
//🔹 La clase Persona3 redefine toString() para mostrar nombre y edad como una cadena formateada.
//🔹 En main(), se crean dos objetos con diferentes datos y se imprimen directamente.
//🔹 Gracias al override, el resultado es personalizado y no el predeterminado de Kotlin.
//🔹 Excelente ejemplo para mostrar cómo personalizar la salida de objetos.