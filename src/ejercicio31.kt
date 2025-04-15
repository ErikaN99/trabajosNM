fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int): Int {
    return fn(v1, v2)
}

fun sumar(x1: Int, x2: Int) = x1 + x2
fun restar(x1: Int, x2: Int) = x1 - x2
fun multiplicar(x1: Int, x2: Int) = x1 * x2
fun dividir(x1: Int, x2: Int) = x1 / x2

fun main(parametro: Array<String>) {
    val resul = operar(10, 5, ::sumar)
    println("La suma de 10 y 5 es $resul")

    val resu2 = operar(5, 2, ::sumar)
    println("La suma de 5 y 2 es $resu2")

    println("La resta de 100 y 40 es ${operar(100, 40, ::restar)}")
    println("El producto entre 5 y 20 es ${operar(5, 20, ::multiplicar)}")
    println("La división entre 10 y 5 es ${operar(10, 5, ::dividir)}")
}

//Uso de funciones como parámetros en Kotlin.
//🔹 operar() recibe dos valores y una función que define la operación a realizar.
//🔹 Se definen funciones sumar, restar, multiplicar, dividir.
//🔹 En main(), se llama a operar() pasando funciones como argumentos usando ::nombreFuncion.
//🔹 También se muestran los resultados directamente en el println.
//🔹 Excelente ejemplo de programación funcional con paso de funciones.