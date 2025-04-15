class Cliente(var nombre: String, var monto: Float) {
    fun depositar(monto: Float) {
        this.monto += monto
    }
    fun extraer(monto: Float) {
        this.monto -= monto
    }
    fun imprimir() {
        println("$nombre tiene depositado la suma de $monto")
    }
}
class Banco {
    val cliente1: Cliente = Cliente("Juan", 0f)
    val cliente2: Cliente = Cliente("Ana", 0f)
    val cliente3: Cliente = Cliente("Luis", 0f)
    fun operar() {
        cliente1.depositar(100f)
        cliente2.depositar(150f)
        cliente3.depositar(200f)
        cliente3.extraer(150f)
    }
    fun depositosTotales() {
        val total = cliente1.monto + cliente2.monto + cliente3.monto
        println("El total de dinero del banco es: $total")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }
}
fun main(parametro: Array<String>) {
    val banco1 = Banco()
    banco1.operar()
    banco1.depositosTotales()
}

//Simulación de operaciones bancarias con clases Cliente y Banco.
//🔹 Cliente puede depositar, extraer y mostrar su saldo.
//🔹 Banco contiene tres clientes y define las operaciones sobre ellos.
//🔹 operar() realiza depósitos y una extracción.
//🔹 depositosTotales() suma el dinero de los tres clientes.
//🔹 En main(), se instancia el banco, se hacen las operaciones y se imprimen los resultados.
//🔹 Es un excelente ejemplo de colaboración entre objetos.