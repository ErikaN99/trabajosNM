class Persona4(val nombre: String, val edad: Int) {
    fun esMayor(fn:(Int) ->Boolean):Boolean{
    return fn(edad)
    }
}
fun mayorEstadosUnidos(edad: Int): Boolean {
    if (edad >= 21)
        return true
    else
        return false
}
fun mayorArgentina(edad: Int): Boolean {
    if  (edad >= 18)
        return true
    else
        return false
}
fun main(parametro: Array<String>) {
    val persona1 = Persona4("Juan", 18)
    if (persona1.esMayor(::mayorArgentina))
        println("${persona1.nombre} es mayor si vive en Argentina")
    else
        println("${persona1.nombre} no es mayor si vive en Argentina")
    if (persona1.esMayor(::mayorEstadosUnidos))
        println("${persona1.nombre} es mayor si vive en Estados Unidos")
    else
        println("${persona1.nombre} no es mayor si vive en Estados Unidos")
}

//Paso de funciones como parámetros dentro de una clase.
//🔹 La clase Persona4 incluye un metodo esMayor() que evalúa una función booleana sobre la edad.
//🔹 Se definen dos funciones: mayorEstadosUnidos() y mayorArgentina() con diferentes reglas de mayoría de edad.
//🔹 En main(), se crea una persona y se evalúa si es mayor según los dos países.
//🔹 Ideal para aprender cómo usar funciones de evaluación externa con objetos.