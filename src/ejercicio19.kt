data class Articulo(var codigo: Int, var descripcion: String, var precio: Float)

fun main(parametro: Array<String>) {
    val articulo1 = Articulo(1, "papas", 34f)
    val articulo2 = Articulo(2, "manzanas", 24f)
    println(articulo2)
    println(articulo1)

    val puntero = articulo1
    puntero.precio = 100f
    println(articulo1)

    var articulo3 = articulo1.copy()
    articulo1.precio = 200f
    println(articulo1)
    println(articulo3)

    if (articulo1 == articulo3)
        println("Son iguales ${articulo1} y ${articulo3}")
    else
        println("Son distintos ${articulo1} y ${articulo3}")

    articulo3.precio = 200f
    if (articulo1 == articulo3)
        println("Son iguales ${articulo1} y ${articulo3}")
    else
        println("Son distintos ${articulo1} y ${articulo3}")
}

//Ejemplo que demuestra el uso de data class y copia de objetos.
//🔹 Se define Articulo como clase de datos con codigo, descripcion y precio.
//🔹 Se crean e imprimen varios artículos, incluyendo una copia (copy()) del primero.
//🔹 Se modifican atributos y se comparan los objetos con == para ver si siguen siendo iguales.
//🔹 Muestra cómo los cambios en una copia no afectan al original, y cómo comparar objetos.
//🔹 Ideal para aprender sobre la utilidad de data class y la igualdad estructural.