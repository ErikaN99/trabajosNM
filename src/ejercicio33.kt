fun operar2(v1: Int, v2: Int, fn: (Int, Int) -> Int): Int {
    return fn(v1, v2)
}

fun main(parametro: Array<String>) {
    val suma = operar2(2, 3, { x, y -> x + y })
    println(suma)

    val resta = operar2(12, 2, { x, y -> x - y })
    println(resta)

    val elevarCuarta = operar2(2, 4, { x, y ->
        var valor = 1
        for (i in 1..y) {
            valor *= x
        }
        valor
    })
    println(elevarCuarta)
}
//Uso de funciones lambda como argumentos.
//🔹 operar2() acepta dos enteros y una función lambda que opera sobre ellos.
//🔹 En main(), se realizan suma, resta y potencia (elevación a una potencia) con funciones definidas directamente dentro de la llamada.
//🔹 Se muestra cómo trabajar con lambdas más complejas con estructuras como bucles.
//🔹 Muy útil para aplicar lógica personalizada al vuelo.