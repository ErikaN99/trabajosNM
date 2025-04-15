fun String.mitadPrimera(): String {
    return this.substring(0 until this.length/2)
}

fun String.segundaMitad(): String {
    return this.substring(this.length/2 until this.length)
}

fun main(args: Array<String>) {
    val cadena = "viento"
    println(cadena.mitadPrimera())  // Salida: "vie"
    println(cadena.segundaMitad())   // Salida: "nto"
}

//Se extiende la clase String con dos funciones:
//	mitadPrimera(): devuelve la primera mitad de la cadena.
//	segundaMitad(): devuelve la segunda mitad de la cadena.
//En main, se crea una cadena "viento" y se prueban ambas funciones:
//	"vie" es la primera mitad.
//	"nto" es la segunda.