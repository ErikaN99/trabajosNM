abstract class Operacion2(val valor1: Int, val valor2: Int) {
    protected var resultado: Int = 0
    abstract fun operar()
    fun imprimir() {
        println("Resultado: $resultado")
    }
}

class Suma(valor1: Int, valor2: Int): Operacion2(valor1, valor2) {
    override fun operar() {
        resultado = valor1 + valor2
    }
}

class Resta(valor1: Int, valor2: Int): Operacion2(valor1, valor2) {
    override fun operar() {
        resultado = valor1 - valor2
    }
}

fun main(args: Array<String>) {
    val suma1 = Suma(10, 4)
    suma1.operar()
    suma1.imprimir()

    val resta1 = Resta(20, 5)
    resta1.operar()
    resta1.imprimir()
}

//Uso de clases abstractas para definir un comportamiento común con especialización.
//🔹 Operacion2 es una clase abstracta con una propiedad resultado y un método abstracto operar().
//🔹 Suma y Resta son clases hijas que implementan el método operar() de forma específica.
//🔹 En main(), se crean objetos de ambas clases, se ejecutan operaciones y se imprime el resultado.
//🔹 Ilustra muy bien el concepto de abstracción y polimorfismo.