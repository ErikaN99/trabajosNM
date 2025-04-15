enum class TipoOperacion(val tipo: String) {
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/")
}

class Operacion(val valor1: Int, val valor2: Int, val tipoOperacion: TipoOperacion) {

    fun operar() {
        var resultado = 0
        when (tipoOperacion) {
            TipoOperacion.SUMA -> resultado = valor1 + valor2
            TipoOperacion.RESTA -> resultado = valor1 - valor2
            TipoOperacion.MULTIPLICACION -> resultado = valor1 * valor2
            TipoOperacion.DIVISION -> resultado = valor1 / valor2
        }
        println("$valor1 ${tipoOperacion.tipo} $valor2 es igual a $resultado")
    }
}

fun main(parametro: Array<String>) {
    val operacion1 = Operacion(10, 4, TipoOperacion.SUMA)
    operacion1.operar()
}
//Uso de enum class con parámetros y lógica condicional en Kotlin.
//🔹 TipoOperacion define cuatro operaciones con su símbolo respectivo.
//🔹 La clase Operacion recibe dos valores enteros y un tipo de operación.
//🔹 En el método operar(), se calcula el resultado según el tipo de operación.
//🔹 Se usa when para evaluar cada caso del enum.
//🔹 En main(), se crea una operación de suma y se ejecuta.
//🔹 Excelente ejemplo para aprender enums con argumentos y lógica condicional.
