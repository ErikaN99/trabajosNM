open class PersonaDato(val nombre: String, val edad: Int) {
    open fun imprimir() {
        println("Nombre: $nombre")
        println("Edad: $edad")
    }
}

class Empleado(nombre: String, edad: Int, val sueldo: Double) : PersonaDato(nombre, edad) {
    override fun imprimir() {
        super.imprimir()
        println("Sueldo: $sueldo")
    }

    fun pagaImpuestos() {
        if (sueldo > 3000)
            println("El empleado $nombre paga impuestos")
        else
            println("El empleado $nombre no paga impuestos")
    }
}

fun main(parametro: Array<String>) {
    val persona1 = PersonaDato("Jose", 22)
    println("Datos de la persona")
    persona1.imprimir()

    val empleado1 = Empleado("Ana", 30, 5000.0)
    println("Datos del empleado")
    empleado1.imprimir()
    empleado1.pagaImpuestos()
}
//Se utiliza herencia entre clases con sobreescritura de métodos (override).
//🔹 PersonaDato es una clase base con nombre y edad.
//🔹 Empleado hereda de PersonaDato y agrega el sueldo.
//🔹 Empleado sobreescribe el método imprimir() y añade pagaImpuestos(), que evalúa si debe pagar impuestos según su sueldo.
//🔹 En main(), se crean e imprimen objetos de ambas clases.
//🔹 Ilustra claramente herencia, polimorfismo y uso de super.